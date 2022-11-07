package ValidAnagram;

public class ValidAnagram1stTryStringBuilder {


    public static void main(String[] args) {

        String s = "ab",
                t = "ba";

        System.out.println("\"" + s + "\" is valid anagram of \"" + t + "\"\n" +
                validAnagram(s, t));
    }

    private static boolean validAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        StringBuilder sb=new StringBuilder(t);
        for (char ch : s.toCharArray()) {
            int index = sb.indexOf("" + ch);
            if (index >= 0) sb.delete(index,index+1);
        }
        return sb.isEmpty();

    }
}
