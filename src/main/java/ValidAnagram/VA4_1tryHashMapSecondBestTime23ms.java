package ValidAnagram;

import java.util.HashMap;
import java.util.Map;

public class VA4_1tryHashMapSecondBestTime23ms {


    public static void main(String[] args) {

        String s = "anagram",
                t = "nagaram";

        System.out.println("\"" + s + "\" is valid anagram of \"" + t + "\"\n" +
                validAnagram(s, t));
    }

    private static boolean validAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character chS = s.charAt(i);
            map.put(chS, map.getOrDefault(chS, 0) + 1);
            Character chT = t.charAt(i);
            map.put(chT, map.getOrDefault(chT, 0) - 1);
        }
        //   map.entrySet().removeIf(e -> e.getValue() == 0);
        map.values().removeIf(p -> p == 0);
        return map.isEmpty();
    }
}
