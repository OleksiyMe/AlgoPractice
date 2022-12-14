package FrequencyOfWords;

public class _2ndTry {

    public static void main(String[] args) {

        String input = "“This” is an example!     of Example… abc";
        System.out.println(freqOfWords(input));

    }

    private static String freqOfWords(String input) {
        StringBuilder sb = new StringBuilder();
        //leave only letters and spaces
        input = input.toLowerCase().replaceAll("[^a-zA-z ]", "");
        //remove duplicated spaces
        input = input.replaceAll(" +", " ");


        for (String each : input.split(" ")) {
            //count repeating current word in input
            int count = (input.replace(each, each + 1).length() - input.length());
            //if we already counted word -- continue
            if (count == 0) continue;
            //build result
            sb.append(each + "=" + count + ", ");
            //delete counted word
            input = input.replace(each, "");
        }
        //making a pretty output, according task :)
        return (sb.toString() + "}").replace(", }", "}");
    }
}
