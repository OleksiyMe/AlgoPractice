package WordBreakProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class WordBreakBooleanDicPermute {
    public static void main(String[] args) {
        ArrayList<String> dic = new ArrayList<>(Arrays.asList(
                "cc", "ac"
        ));
        String testWord = "ccaccc";
        System.out.println(putBreakes(testWord, dic));
    }

    private static boolean putBreakes(String s, List<String> wordDict) {
        List<List<String>> permutedWordList = new ArrayList<>();
        permute(wordDict, new ArrayList<>(), permutedWordList);
        String tmp = s;
        boolean result = false;

        for (List<String> eachListOfStrings : permutedWordList) {
            for (String eachWord : eachListOfStrings) {
                while (tmp.contains(eachWord)) {
                    tmp = tmp.replaceFirst(eachWord, "^".repeat(eachWord.length()));
                }
                result = result || tmp.replace("^", "").isEmpty();
        }

        }
        return result;
    }


    private static void permute(List<String> input, List<String> fixedPart, List<List<String>> answer) {
        if (input.size() == 0) {
            answer.add(fixedPart);
            if (answer.size() % 1000 == 0) System.out.println(answer.size() / 1000 + "K");
            return;
        }
        for (int i = 0; i < input.size(); i++) {
            String current = input.get(i);
            List<String> partToChange = input.stream()
                    .filter(a -> !a.equals(current)).collect(Collectors.toList());
            List<String> pivot = new ArrayList<>(fixedPart);
            pivot.add(current);
            permute(partToChange, pivot, answer);
        }
    }
}
