package ValidParentheses;

import java.util.ArrayDeque;

public class _1stTry2 {
    public static void main(String[] args) {
        //String s = ")(";  // 0
        // String s ="()(())";  // 6
        // String s ="(()";  // 2
        // String s = ")()())"; //4
        //String s = ")))()(((";   //2
        //String s="";
       //String s = "()(()";    // 2
        // String s= "())()"    ;    //2
        // String s=")()())";  //4
        // String s = ")()())(()())(";   //6
        // String s="()(()"; //2
        //String s="(())()(()(("; //6
        String s =")()())()()(";   //4

        System.out.println(longestValidParentheses(s));
    }

    private static int longestValidParentheses(String s) {



        ArrayDeque<Character> stack = new ArrayDeque<>();
        ArrayDeque<Character> stack2 = new ArrayDeque<>();
        int counter = 0, counterMax = 0;
        int counter2 = 0, counterMax2 = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(ch);  //openinggs to stack
                continue;
            }

            if (!stack.isEmpty()) {    //closings out of stack
                stack.pop();
                counter += 2;
            } else {
                counterMax = Math.max(counterMax, counter);
                counter = 0;                                      //if sequence wrong -- reset the counter
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {

            char ch = s.charAt(i);

            if (ch == ')') {
                stack2.push(ch);  //openinggs to stack
                continue;
            }

            if (!stack2.isEmpty()) {    //closings out of stack
                stack2.pop();
                counter2 += 2;
            } else {
                counterMax2 = Math.max(counterMax2, counter2);
                counter2 = 0;                                      //if sequence wrong -- reset the counter
            }
        }
        counterMax = counterMax == 0 ? counter : counterMax;
        counterMax2 = counterMax2 == 0 ? counter2 : counterMax2;
        counterMax = Math.max(counterMax, counter);
        counterMax2 = Math.max(counterMax2, counter2);

        return (stack.isEmpty())?counterMax:counterMax2;

    }
}

















