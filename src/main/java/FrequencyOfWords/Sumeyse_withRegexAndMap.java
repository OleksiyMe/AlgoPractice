package FrequencyOfWords;

import java.util.HashMap;

public class Sumeyse_withRegexAndMap {

    public static void main(String[] args) {

        String input = "  “This”  is an 1example!     of Example… abc";
        System.out.println(freqOfWords(input));

    }

    private static String freqOfWords(String input) {
        if(input.isBlank())return "{}";
        HashMap<String, Integer> result = new HashMap<>();
//String [] words =input.trim().replaceAll("[^TrieNode-Za-z]+", "").toLowerCase().split(" +");
//String []words =input.trim().toLowerCase().split("[^TrieNode-Za-z]+");
        String[] words = input.trim().toLowerCase().split("\\W+");
        for (String word : words) {
            result.put(word, result.getOrDefault(word, 0) + 1);
        }
        return result.toString();

    }
}
