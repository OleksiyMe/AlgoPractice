package LongestSubstringWithNonRepeatingCh;

import java.util.HashSet;

public class _2ndTry {

    public static void main(String[] args) {

        String s = "abcabcbb";

        System.out.println("The longest non repeating  part of \"" + s + "\"\n is: " + lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) return 1;
        HashSet<Character> set = new HashSet<>();
        int begin = 0, end = 0, max = 0;
        boolean beginIsSet = false;

        for (int i = 0; i < s.length(); i++) {
            if (!beginIsSet && set.add(s.charAt(i))) {
                begin = i;
                beginIsSet = true;
                continue;
            }
            if (!set.add(s.charAt(i))) {
                end = i;
                max = Math.max(max, end - begin);
                set = new HashSet<>();
                beginIsSet = false;
                i=begin;
                continue;
            }
            if (i == s.length() - 1) {
                end = i+1;
                max = Math.max(max, end - begin);
            }
        }

        return max;
    }
}
