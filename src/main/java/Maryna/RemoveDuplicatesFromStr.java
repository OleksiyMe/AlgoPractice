package Maryna;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromStr {

    public static void main(String[] args) {

        String input = "AABACACGGAZXZ";

        System.out.println("Our input is " + input + "\nOur output is " +
                removeDuplicates(input));


    }

    private static String removeDuplicates(String input) {

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            set.add(input.charAt(i));
        }
        StringBuilder sb =new StringBuilder();
        for (Character character : set) {
            sb.append(character);
        }
        return sb.toString();


    }


}
