package ValidAnagram;

import java.util.Arrays;

public class ValidAnagram2ndTryCharArray {


    public static void main(String[] args) {

        String s = "ab",
                t = "ba";

        System.out.println("\"" + s + "\" is valid anagram of \"" + t + "\"\n" +
                validAnagram(s, t));
    }

    private static boolean validAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray,tArray);

    }
}
