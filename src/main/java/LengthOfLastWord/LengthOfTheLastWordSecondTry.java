package LengthOfLastWord;

public class LengthOfTheLastWordSecondTry {

    public static void main(String[] args) {

        String word = "Life is good  ";

        System.out.println("Length of the last word is: " + lengthOfTheLast(word));
    }

    private static int lengthOfTheLast(String word) {

        while (word.lastIndexOf(" ") == word.length() - 1)
            word = word.substring(0, word.length() - 2);

        return word.substring(word.lastIndexOf(" ") + 1).length();
    }


}
