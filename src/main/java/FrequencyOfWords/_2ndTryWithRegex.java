package FrequencyOfWords;

public class _2ndTryWithRegex {

    public static void main(String[] args) {

        String input = " “This” is an example!     of Example… abc";
        System.out.println(freqOfWords(input));

    }

    private static String freqOfWords(String input) {
        StringBuilder result = new StringBuilder("{");
        //leave only letters and spaces
        input = input.toLowerCase().replaceAll("[^a-zA-z ]", "");
        //remove duplicated spaces
        input = input.replaceAll(" +", " ");


        for (String each : input.trim().split(" ")) {
            //count repeating current word in input
            int count = (input.replace(each, each + 1).length() - input.length());
            //if we already counted word -- continue
            if (count == 0) continue;
            //build result
            result.append(each + "=" + count + ", ");
            //delete counted word
            input = input.replace(each, "");
        }
        //making a pretty output, according to task :)
        return (result.toString() + "}").replace(", }", "}");
    }
}
