package LongestSubstringWithNonRepeatingCh;

import java.util.HashSet;

public class _4th_try_29Jan23 {

    public static void main(String[] args) {

        String s = "aabcdcaaabcdedcaaabc";

        System.out.println("The longest non repeating  part of \"" + s + "\"\n is: " + lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set =new HashSet<>();
        int max=0, count=0, start=0;
        for (int i = 0; i < s.length(); i++) {
            if(set.add(s.charAt(i))){
                count++;
            } else {
                max=Math.max(max,count);
                count=0;
                start++;
                i=start-1;
                set.clear();
            }
        }
        return Math.max(count,max);
    }
}
