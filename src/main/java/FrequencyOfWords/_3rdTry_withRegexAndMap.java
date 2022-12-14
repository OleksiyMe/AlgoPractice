package FrequencyOfWords;

import java.util.HashMap;

public class _3rdTry_withRegexAndMap {

    public static void main(String[] args) {

        String input = "“This” is an example!     of Example… abc";
        System.out.println(freqOfWords(input));

    }

    private static String freqOfWords(String input) {
        HashMap<String,Integer> result=new HashMap<>();
        //leave only letters and spaces
        input = input.toLowerCase().replaceAll("[^a-zA-z ]", "");
        //remove duplicated spaces
        input = input.replaceAll(" +", " ");


        for (String each : input.split(" ")) {
            result.put(each,result.getOrDefault(each,0)+1 ) ;
        }

        return result.toString();
    }
}
