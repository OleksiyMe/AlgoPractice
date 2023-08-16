package Maryna;

import java.util.LinkedHashMap;
import java.util.Map;

public class FreqOfLettersWithMap {

    public static void main(String[] args) {
        String input = "My Lovely String";
        System.out.println("My string is: " + input);
        System.out.println("The frequency of the eac letter in the string \"" + input + "\" is:\n" +
                freqOfLetters(input));
    }

    public static Map<Character, Integer> freqOfLetters(String input) {
        //let us use LinkedHashMap to preserve the order of appearance of the letters
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            //putting each letter into map as a key and increment value by 1
            map.put(input.charAt(i), map.getOrDefault(input.charAt(i), 0) + 1);
        }
        return map;
    }

}
