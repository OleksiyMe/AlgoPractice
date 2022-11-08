package ValidAnagram;

import java.util.HashMap;
import java.util.Map;

public class VA5tryHashMap {


    public static void main(String[] args) {

        String s = "ab",
                t = "ba";

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
            if (map.containsKey(chS) && map.get(chS) == 0) map.remove(chS);
            if (map.containsKey(chT) && map.get(chT) == 0) map.remove(chT);
        }

        return map.isEmpty();
    }
}
