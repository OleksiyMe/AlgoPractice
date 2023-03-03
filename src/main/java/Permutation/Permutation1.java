package Permutation;

import java.util.ArrayList;
import java.util.List;

public class Permutation1 {
    private static List<String> list;

    public static void main(String[] args) {

        list = new ArrayList<>();
        String str = "boat", answer = "";

        permute(str, answer);
        System.out.println(list);


    }

    private static void permute(String str, String answer) {

        if (str.length() == 0) {
            list.add(answer);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String leftSub = str.substring(0, i);
            String rightSub = str.substring(i + 1);
            String withoutCurrent = leftSub + rightSub;
            permute(withoutCurrent, answer + ch);

        }


    }


}










