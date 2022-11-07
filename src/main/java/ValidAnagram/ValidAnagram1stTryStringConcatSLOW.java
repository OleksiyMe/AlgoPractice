package ValidAnagram;

public class ValidAnagram1stTryStringConcatSLOW {


    public static void main(String[] args) {

        String s = "ab",
                t = "a";

        System.out.println("\"" + s + "\" is valid anagram of \"" + t + "\"\n" +
                validAnagram(s, t));
    }

    private static boolean validAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        for (char ch : s.toCharArray()) {
            int index = t.indexOf("" + ch);
            if (index >= 0) t = t.substring(0, index) + t.substring(index + 1);
        }
        return t.isBlank();

    }
}
