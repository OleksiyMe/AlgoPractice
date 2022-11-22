package ValidParentheses;

import java.util.ArrayDeque;

public class _1stTry {
    public static void main(String[] args) {
        //String s = ")(";  // 0
        // String s ="()(())";  // 6
       // String s ="(()";  // 2
        // String s = ")()())"; //4
        //String s = ")))()(((";   //2
        //String s="";
      //  String s = "()(()";    // 2
        String s= "())()"    ;    //2
        // String s=")()())";  //4
       // String s = ")()())(()())(";   //6
       // String s="()(()"; //2

        System.out.println(longestValidParentheses(s));
    }

    private static int longestValidParentheses(String s) {

//        if (s.isEmpty() || s.length() == 1) return 0;
//
//        while (sb.indexOf(")") == 0) sb.delete(0, 1);
//        int b = sb.length();
//        if (sb.isEmpty() || sb.length() == 1) return 0;
//        while (sb.lastIndexOf("(") == sb.length() - 1) sb.delete(sb.length() - 1, sb.length());
//        if (sb.isEmpty() || sb.length() == 1) return 0;

        ArrayDeque<Character> stack = new ArrayDeque<>();
        int counter = 0, counterMax = 0;

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
                counter=0;                                      //if sequence wrong -- reset the counter
            }
        }
        return counterMax == 0 ? counter : counterMax;  //if no repetitions - use counter to return
    }
}

















