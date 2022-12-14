package FrequencyOfWords;

public class _1stTry_withoutRegexAndWithoutMap {

    public static void main(String[] args) {

        String input = "  “This” is an example! of Example… abc";
        System.out.println(freqOfWords(input));
    }

    private static String freqOfWords(String input) {
        StringBuilder sb = new StringBuilder();

        for (char ch : input.trim().toLowerCase().toCharArray()) {
            //clear repeating spaces
            if (ch == ' ' && sb.charAt(sb.length() - 1) == ' ') continue;
            //clear all non alphabetical
            if (Character.isAlphabetic(ch) || ch == ' ') sb.append(ch);
        }

        input = sb.toString();
        sb = new StringBuilder("{");

        for (String each : input.split(" ")) {
            //count repeating each in input
            int count = (input.replace(each, each + 1).length() - input.length());
            //if we already counted word -- continue
            if (count == 0) continue;
            //build result
            sb.append(each + "=" + count + ", ");
            //delete counted word
            input = input.replace(each, "");
        }
        //making a pretty output, according to task :)
        return (sb.toString() + "}").replace(", }", "}");
    }
}
