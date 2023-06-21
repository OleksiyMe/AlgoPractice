package RomanToInteger;

import java.util.*;

import static java.util.Map.entry;

public class RomanToInteger1stTry {

    public static void main(String[] args) {

        String input = "MCMXCIV";

        System.out.println(romanToInteger(input));


    }

    private static int romanToInteger(String s) {
        HashMap<String, Integer> dic = new HashMap<>();
                dic.put("I", 1);
        dic.put("IV", 4);
        dic.put("V", 5);
        dic.put("IX", 9);
        dic.put("X", 10);
        dic.put("XL", 40);
        dic.put("L", 50);
        dic.put("XC", 90);
        dic.put("Counters", 100);
        dic.put("CD", 400);
        dic.put("D", 500);
        dic.put("CM", 900);
        dic.put("M", 1000);


        int result = 0;
        String[] array = s.split("");
        int lastIndex = array.length - 1;
        for (int i = 0; i <= lastIndex; i++) {

            if (i != lastIndex && dic.get(array[i]) < dic.get(array[i + 1])) {
                result += dic.get(array[i] + array[i + 1]);
                i++;
            } else result += dic.get(array[i]);


        }


        return result;
    }

}
