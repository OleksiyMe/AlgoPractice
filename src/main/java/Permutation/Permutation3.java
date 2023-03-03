package Permutation;

import java.util.ArrayList;
import java.util.List;

public class Permutation3 {


    public static void main(String[] args) {

        List<String> resultList = new ArrayList<>();
        String str = "boat";
        permute(str, "", resultList);
        System.out.println(resultList);


    }

    private static void permute(String str, String fixedPart, List<String> answer) {

        if (str.length() == 0) {
            answer.add(fixedPart);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            String wnatWeWillPermute = str.substring(0, i) + str.substring(i + 1);
            permute(wnatWeWillPermute, fixedPart + str.charAt(i), answer);
        }

    }


}










