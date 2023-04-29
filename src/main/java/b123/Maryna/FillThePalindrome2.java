package b123.Maryna;

public class FillThePalindrome2 {

    public static void main(String[] args) {

        //String input = "abb?";
        //String input = "bab??a";
        String input = "?b?";
        int length = input.length();
        String result = "";
        for (int i = 0; i <length; i++) {
            char currentChar = input.charAt(i);
            char symmetricChar = input.charAt(length - i - 1);

            if (currentChar == '?' && symmetricChar == '?') {
                result += 'z';
                input = input.substring(0, i) + "z" + input.substring(i + 1, length);
                continue;
            }
            if (currentChar == '?') {
                result += symmetricChar;
                input = input.substring(0, i) + symmetricChar + input.substring(i + 1, length);
                continue;
            }
            if (currentChar != symmetricChar) {
                result = "NO";
                break;
            }
            result += input.charAt(i);
        }

        System.out.println(result);

    }
}
