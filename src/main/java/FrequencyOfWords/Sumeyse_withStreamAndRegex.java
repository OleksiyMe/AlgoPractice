package FrequencyOfWords;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sumeyse_withStreamAndRegex {

    public static void main(String[] args) {

        String input = "  “This”  is an 1example!     of Example… abc";
        System.out.println(freqOfWords1(input));

    }

    private static String freqOfWords(String input) {
        if(input.isBlank())return "{}";
        Map<String, Long> result = new HashMap<>();

        result= Arrays.stream(input.trim().toLowerCase().split("[^A-Za-z]+"))
                .filter(p->!p.isBlank())
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));

        return result.toString();
    }
    private static String freqOfWords1(String input) {
        if(input.isBlank())return "{}";
        Map<String, Integer> result = new HashMap<>();

        result= Arrays.stream(input.trim().toLowerCase().split("[\\W\\d*]+"))
                .filter(p->!p.isBlank())
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.summingInt(s->1)));

        return result.toString();
    }

}
