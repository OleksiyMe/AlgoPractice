package Permutation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        String abba = "abba";
        permutePrint(Arrays.asList(abba.split("")), 0);

    }

    static void permutePrint(List<String> list, int k) {
        for (int i = k; i < list.size(); i++) {
            Collections.swap(list, i, k);
            permutePrint(list, k + 1);
            Collections.swap(list, k, i);
        }
        if (k == list.size() - 1) {
            System.out.print (list.toString().replace(", ","").
                    replace("[","").replace("]","")+", ");
        }
    }
}