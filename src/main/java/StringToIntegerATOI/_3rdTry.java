package StringToIntegerATOI;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _3rdTry {

    public static void main(String[] args) {

        String s = "4193 with words";
        System.out.println("The string is: " + s);
        System.out.println("The Number is: " + myAtoi(s));
    }

    private static int myAtoi(String s) {

        if (s.isBlank()) return 0;

        int pointer = 0;
        //finding the beginning of our num
        for (int i = 0; s.charAt(i) != '+'
                && s.charAt(i) != '-'
                && !Character.isDigit(s.charAt(i)); i++) {
            if (s.charAt(i) != ' ') return 0;
            pointer++;
        }
        StringBuilder sb = new StringBuilder(s.substring(pointer));

        //dealing with +- or -+ case
        if (sb.length() > 1 && !Character.isDigit(sb.charAt(0)) && !Character.isDigit(sb.charAt(1))) return 0;
        if (sb.length() == 1 && !Character.isDigit(sb.charAt(0))) return 0;      // case if whole string is "+" or "-"

        pointer = 0;
        if (!Character.isDigit(sb.charAt(0))) pointer = 1; //jumping over + or - if one of them is present

        //finding the end of our num
        while (Character.isDigit(sb.charAt(pointer))) {
            pointer++;
            if (pointer > sb.length() - 1) break;
        }
        sb.delete(pointer, sb.length());

        if (sb.length() > 12) {
            sb.delete(1, sb.length() - 11);
        }
        long result = Long.parseLong(sb.toString());

        if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int) result;
    }


}
