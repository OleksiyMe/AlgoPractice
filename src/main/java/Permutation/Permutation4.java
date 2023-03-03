package Permutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Permutation4 {


    public static void main(String[] args) {

        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3));
        permute(input, new ArrayList<>(), resultList);
        System.out.println(resultList);

//         new Consumer<String>(){
//             @Override
//             public void accept(String  o) {
//                 System.out.println(o);
//             }
//         }.accept("Oleksiy");


    }

    private static void permute(List<Integer> input, List<Integer> fixedPart, List<List<Integer>> answer) {

        if (input.size() == 0) {
            answer.add(fixedPart);
            return;
        }

        for (int i = 0; i < input.size(); i++) {
            Integer current = input.get(i);
            List<Integer> partToChange = input.stream().filter(a -> !a.equals(current)).collect(Collectors.toList());
            List<Integer> pivot =new ArrayList<>(fixedPart);
            pivot.add(current);

            permute(partToChange,pivot, answer);


        }

    }


}










