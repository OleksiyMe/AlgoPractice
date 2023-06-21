package a11;

import java.util.HashSet;
import java.util.Set;

public class Maryna_Unique {
    /*   String_UniqueCharacters
     * Write a return  method that can find the unique characters from the String
     * Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */
    public static void main(String[] args) {
        String input = "AAABBBCCCDEF";
        System.out.println("Unique characters in " + input + " are: " +
                unique(input));
    }

    public static String unique(String input) {
        Set<Character> setUnique = new HashSet<>();
        Set<Character> setNotUnique = new HashSet<>();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            Character ch = input.charAt(i);
            if (setNotUnique.contains(ch)) continue;
            if (!setUnique.add(ch)) {
                setUnique.remove(ch);
                setNotUnique.add(ch);
            }
        }
        for (Character each : setUnique) {
            result += each;
        }
        return result;
    }
}
