package LengsOfLastWord;

public class LengthOfTheLastWordFirstTry {

    public static void main(String[] args) {

        String word = "Life is good  ";

        System.out.println("Length of the last word is: " + lengthOfTheLast(word));
    }

    private static int lengthOfTheLast(String s) {

        int result = 0, sLength =s.length();
        boolean endingSpaces = false;

        if (s.charAt(sLength - 1) == ' ') endingSpaces = true;

        for (int i = sLength - 1; i >= 0; i--) {
            if (endingSpaces && s.charAt(i) == ' ') continue;
            endingSpaces = false;
            if (s.charAt(i) != ' ') {
                result++;
            } else break;
        }
        return result;
    }


}
