package ValidParentheses;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Stack;

public class _1stTryMentor {
    public static void main(String[] args) {
        //String s = ")(";  // 0
        // String s ="()(())";  // 6
         //String s ="(()";  // 2
        // String s = ")()())"; //4
        //String s = ")))()(((";   //2
        //String s="";
       // String s = "()(()";    // 2
         //String s= "())()"    ;    //2
        // String s=")()())";  //4
         //String s = ")()())(()())(";   //6
         String s="()(()"; //2
        //String s="(())()(()(("; //6
        //String s = ")()())()()(";   //4
        //String s ="()()()";

        System.out.println(longestValidParentheses2(s));
    }

    private static int longestValidParentheses(String s) {
        if(s==null){
            return 0;
        }
        Stack<Integer> stack = new Stack();
        int result = 0;
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')' && stack.size() > 1 && s.charAt(stack.peek()) == '(') {
                stack.pop();
                result = Math.max(result, i - stack.peek());
            } else {
                stack.push(i);
            }
        }
        return result;
    }

    public static int longestValidParentheses2(String s) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(-1);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                stack.push(i);
            else {
                stack.pop();
                if (stack.isEmpty())  // catches the index of the last invalid sign
                    stack.push(i);
                else                // there is a valid series
                    result = Math.max(result, i - stack.peek());
            }
        }
        return result;
    }
}

















