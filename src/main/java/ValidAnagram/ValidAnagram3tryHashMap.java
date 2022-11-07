package ValidAnagram;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram3tryHashMap {


    public static void main(String[] args) {

        String s = "aaaabb",
                t = "aaaabb";

        System.out.println("\"" + s + "\" is valid anagram of \"" + t + "\"\n" +
                validAnagram(s, t));
    }

    private static boolean validAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character chS = s.charAt(i);
            Character chT = t.charAt(i);
            map.put(chS, map.getOrDefault(chS, 0) + 1);
            map2.put(chT, map2.getOrDefault(chT, 0) + 1);
        }

        return map.equals(map2);
    }
}
