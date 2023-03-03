package b123.EveryOtherAlfabeticUpper;

public class Solution {
    public static void main(String[] args) {

        String str = "We are the world";
        System.out.println(everyOtherToUpper(str));
    }

    private static String everyOtherToUpper(String str) {

        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (char everyChar : str.toCharArray()) {
            if (everyChar == ' ') sb.append(' ');
            if (Character.isAlphabetic(everyChar)) {
                if (i % 2 != 0) sb.append(Character.toUpperCase(everyChar));
            else sb.append(everyChar);
            }
        i++;
        }
        return sb.toString();
    }
}
