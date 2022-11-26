package LongestSubstringWithNonRepeatingCh;

import java.util.*;

public class _1stTry {

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
            if (!beginIsSet && set.add(s.charAt(i))) {    //find the beginning of proper substring
                begin = i;
                beginIsSet = true;
                continue;
            }
            if (!set.add(s.charAt(i))) {    //find the end of proper substring
                end = i;
                max = Math.max(max, end - begin);   //calculate it's length
                set = new HashSet<>();       //reset loop for finding another proper substring
                beginIsSet = false;
                i=begin;
                continue;
            }
            if (i == s.length() - 1) {  //case when proper substring goes to the end
                end = i+1;
                max = Math.max(max, end - begin);
            }
        }

        return max;
    }
}
