package LengthOfLastWord;

public class LengthOfTheLastWord_BySumeyse {

    public static void main(String[] args) {

        String word = "Life is good  ";

        System.out.println("Length of the last word is: " + lengthOfTheLast(word));
    }

    private static int lengthOfTheLast(String word) {

        int lastCharIndex = word.length() - 1;
        int result = 0;
        while (lastCharIndex >= 0 && word.charAt(lastCharIndex) == ' ') lastCharIndex--;
        while (lastCharIndex > 0 && word.charAt(lastCharIndex) != ' ') {
            lastCharIndex--;
            result++;
        }
        return result;
    }


}
