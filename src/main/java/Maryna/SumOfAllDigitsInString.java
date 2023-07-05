package Maryna;

public class SumOfAllDigitsInString {
    //    String_SumOfAllDigits
//    Write a method that can return the sum of the digits in a string
//    Ex:  "12 java 5 apple 3"  ==>  20
    public static void main(String[] args) {
        String input = "12 java 5 apple 3";
        System.out.println("Sum of all digits in string \n" +
                input +
                "\nis " + sum(input));
    }

    private static int sum(String input) {

        int begin = 0, end = 0, sum = 0, length = input.length();
        for (int i = 0; i < length; i++) {
            if (Character.isDigit(input.charAt(i))) {
                begin = i;
                end = i;
                while (++i < length && Character.isDigit(input.charAt(i))) {
                    end = i;
                }
                sum += Integer.parseInt(input.substring(begin, end + 1));
            }
        }
        return sum;
    }
}
