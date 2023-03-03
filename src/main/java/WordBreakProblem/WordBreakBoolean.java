package WordBreakProblem;

import java.util.*;

public class WordBreakBoolean {
    public static void main(String[] args) {
        ArrayList<String> dic = new ArrayList<>(Arrays.asList(
                "cc","ac"
        ));
        String testWord = "ccaccc";
        System.out.println(putBreakes(testWord, dic));
    }

    private static boolean putBreakes(String s, List<String> wordDict) {
        Collections.sort(wordDict, (a, b) -> a.length() >= b.length() ? 1 : -1);
        String tmp=s;
        for (String each : wordDict) {
            while (s.contains(each)) {
                s = s.replaceFirst(each, "^".repeat(each.length()));
            }
        }
        boolean r1= s.replace("^", "").isEmpty();
        Collections.sort(wordDict, (a, b) -> a.length() <= b.length() ? 1 : -1);
        s=tmp;
        for (String each : wordDict) {
            while (tmp.contains(each)) {
                tmp = tmp.replaceFirst(each, "^".repeat(each.length()));
            }
        }
        boolean r2=r1|| tmp.replace("^", "").isEmpty();
        Collections.sort(wordDict, (a, b) -> a.charAt(0) <= b.charAt(0) ? 1 : -1);
        tmp=s;
        for (String each : wordDict) {
            while (s.contains(each)) {
                s = s.replaceFirst(each, "^".repeat(each.length()));
            }
        }
        boolean r3=r2|| s.replace("^", "").isEmpty();
        Collections.sort(wordDict, (a, b) -> a.charAt(0) >= b.charAt(0) ? 1 : -1);
        for (String each : wordDict) {
            while (tmp.contains(each)) {
                tmp = tmp.replaceFirst(each, "^".repeat(each.length()));
            }
        }boolean r4=r3|| tmp.replace("^", "").isEmpty();

       return r4||r3;

    }
}
