package WordBreakProblem;

import java.util.*;

public class WordBreak {
    public static void main(String[] args) {
        ArrayList<String> dic = new ArrayList<>(Arrays.asList(
                "i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go", "mango"
        ));
        String testWord = "ilikesamsungicemangoand";
        System.out.println(putBreakes(testWord, dic));
    }

    private static String putBreakes(String s, List<String> dic) {
        Map<Integer, String> map = new TreeMap<>();
        Collections.sort(dic, (a, b) -> a.length() >= b.length() ? 1 : -1);
        for (String each : dic) {
            while (s.contains(each)) {
                int a = s.indexOf(each);
                s = s.replaceFirst(each, "^".repeat(each.length()));
                map.put(a, each);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Integer integer : map.keySet()) {
            sb.append(map.get(integer)).append(" ");
        }
        while (sb.indexOf(" ") == 0) sb.delete(0, 1);
        return sb.toString();

    }
}
