package RomanToInteger;

import java.util.HashMap;

public class RomanToIntegerFourthTry {
    public static void main(String[] args) {

        String input = "MCMXCIV";

        System.out.println(romanToInteger(input));


    }

    private static int romanToInteger(String s) {
        HashMap<Character, Integer> dicCh = new HashMap<>();
        dicCh.put('I', 1);
        dicCh.put('V', 5);
        dicCh.put('X', 10);
        dicCh.put('L', 50);
        dicCh.put('C', 100);
        dicCh.put('D', 500);
        dicCh.put('M', 1000);

        int result = 0;
        int lastIndex = s.length() - 1;
        for (int i = 0; i <= lastIndex; i++) {

            if (i != lastIndex &&
                    dicCh.get(s.charAt(i)) <
                            dicCh.get(s.charAt(i+1))) {
                result += dicCh.get(s.charAt(i+1)) -dicCh.get(s.charAt(i));
                i++;
            } else
                result += dicCh.get(s.charAt(i));
        }
        return result;


    }
}
