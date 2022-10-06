package AllElementsGreaterThanTheirRight;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        int[] array = {10, 4, 6, 3, 5};

        System.out.println(AllElementsGreaterThanTheirRight(array));
    }

    private static List<Integer> AllElementsGreaterThanTheirRight(int[] array) {

        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (array[i] > stack.peek()) {
                stack.pop();
                stack.push(array[i]);
            } else
                stack.push(array[i]);
        }
        return stack;
    }
}

/*
Given unsorted array. Print all elements that are greater than their right neighbours. Use stack.
* */

