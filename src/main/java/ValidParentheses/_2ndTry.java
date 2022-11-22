package ValidParentheses;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Stack;

public class _2ndTry {
    public static void main(String[] args) {
        String s = ")(";  // 0
        // String s ="()(())";  // 6
        //String s ="(()";  // 2
        // String s = ")()())"; //4
        //String s = ")))()(((";   //2
        //String s="";
        // String s = "()(()";    // 2
        //String s= "())()"    ;    //2
        //String s = ")()())";  //4
        //String s = ")()())(()())(";   //6
        // String s="()(()"; //2
        //String s="(())()(()(("; //6
        //String s = ")()())()()(";   //4
        //String s = "()()()";


        System.out.println(longestValidParentheses(s));
    }

    private static int longestValidParentheses(String s) {

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int result = 0;

        stack.push(-1);


        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') stack.push(i);
            else {
                stack.pop();
                if (stack.isEmpty()) stack.push(i);
                else {
                    result = Math.max(result, i - stack.peek());
                }

            }
        }
        return result;



    }
}

















