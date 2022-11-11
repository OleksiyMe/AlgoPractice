package StringToIntegerATOI;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _2ndTryLeetCodeDoNotAcceptMatcher {

    public static void main(String[] args) {

        String s = "    -112`12`142`1342+2=3";
        System.out.println("The string is: " + s);
        System.out.println("The Number is: " + myAtoi(s));
    }

    private static int myAtoi(String s) {

        StringBuilder sb = new StringBuilder();
        long result = 0;
        String regex = "^(\\s*\\d+)|(\\s*-\\d+)|(\\s*\\Q+\\E\\d+)";

        Pattern pattern = Pattern.compile(regex);  //creating a Pattern object
        Matcher matcher = pattern.matcher(s);      //creating a Matcher object
        if (matcher.find())
            sb.append(matcher.group());
        else return 0;

        while (sb.indexOf(" ") == 0) sb.delete(0, 1);  //removing leading spaces

       if (sb.length() > 12) {                                 //if our num too long -- shrink it
            sb.delete(sb.indexOf("^(\\d)"), sb.length() - 11);
        }

        result = Long.parseLong(sb.toString());   //get our num

        if (result < Math.pow(-2, 31)) {                     //shrink our num to (-)2^31
            result = (long) Math.pow(-2, 31);
            return (int) result;
        }
        if (result > (Math.pow(2, 31)) - 1) {
            result = (long) (Math.pow(2, 31)) - 1;
            return (int) result;
        }

        return (int) result;
    }


}
