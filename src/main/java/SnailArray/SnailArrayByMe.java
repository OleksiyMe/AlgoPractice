package SnailArray;

import java.util.ArrayList;

public class SnailArrayByMe {
    public static void main(String[] args) {

        int[][] array = {
                {1, 2, 3}, {4,5,6}, {7,8,9}
        };
        int firstLine = 0, firstRow = 0, lastLine = array.length - 1, lastRow = array[0].length - 1,
                numberOfElements = array.length * array[0].length,
                currentLine = 0, currentRow = 0;
        ArrayList<Integer> result = new ArrayList<>();

        outerLoop:
        for (;;) {

            for (; currentRow <= lastRow; currentRow++) {
                result.add(array[currentLine][currentRow]);
                if (result.size() == numberOfElements) break outerLoop;
            }
            currentRow--;
            currentLine++;
            firstLine++;
            for (; currentLine <= lastLine; currentLine++) {
                result.add(array[currentLine][currentRow]);
                if (result.size() == numberOfElements) break outerLoop;
            }
            currentLine--;
            currentRow--;
            lastRow--;
            for (; currentRow >= firstRow; currentRow--) {
                result.add(array[currentLine][currentRow]);
                if (result.size() == numberOfElements) break outerLoop;
            }
            currentRow++;
            currentLine--;
            lastLine--;
            for (; currentLine >= firstLine; currentLine--) {
                result.add(array[currentLine][currentRow]);
                if (result.size() == numberOfElements) break outerLoop;
            }
            currentLine++;
            currentRow++;
            firstRow++;

        }

        System.out.println("result = " + result);
   }
}


/*Create a function that accepts and array. Given an n x n array, return the array elements arranged from outermost elements to the middle element, traveling clockwise.

Examples:

        snail( [[1,2,3], [4,5,6],[7,8,9]]) // [1,2,3,6,9,8,7,4,5]
        snail([[1,2,3], [8,9,4], [7,6,5]]) // [1,2,3,4,5,6,7,8,9]
        snail([[1,2,3,1], [4,5,6,4], [7,8,9,7], [7,8,9,7]]) // [1,2,3,1,4,7,7,9,8,7,7,4,5,6,8,9]

        */