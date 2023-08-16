package Maryna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayListWithoutSortMethod {
//    Write a method that can sort the ArrayList in Ascending order without using the sort method.

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(
                Arrays.asList(4, 6, 1, 9, 1, 8, 8, 0, -56, 10)
        );
        System.out.println("We had: " + inputList);
        System.out.println("We get: " + sortAsc(inputList));
    }

    public static List<Integer> sortAsc(List<Integer> inputList) {
        //creating temporary variable for swapping elements
        int tmp;
        //creating flag variable for indicating that swap is occured
        boolean elementsWereSwapped = false;
        //outer loop
        for (int i = 0; i < inputList.size(); i++) {
            //before the inner loop reset swapped flag to false
            elementsWereSwapped = false;
            for (int j = 0; j < inputList.size() - 1; j++) {
                //if next element is greater than current -- swap them
                //and set flag elementsWereSwapped to true
                if (inputList.get(j) > inputList.get(j + 1)) {
                    tmp = inputList.get(j);
                    inputList.set(j, inputList.get(j + 1));
                    inputList.set(j + 1, tmp);
                    elementsWereSwapped = true;
                }
            }
            //if there were wo swaps -- we are done
            if (!elementsWereSwapped) break;
        }
        //return sorted list
        return inputList;
    }
}
