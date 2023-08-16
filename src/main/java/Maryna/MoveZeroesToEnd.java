package Maryna;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;


public class MoveZeroesToEnd {



    //    1️⃣  Array_MoveZerosToTheEnd
//    Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
//    input:  {1,0,2,0,3,0,4,0};
//    output: [1, 2, 3, 4, 0, 0, 0, 0]

    public static void main(String[] args) {

        //int[] input = {1, 0, 1};
        int[] input={1,0,2,0,3,0,4,0};
        System.out.println("Input array: " + Arrays.toString(input));
        System.out.println("Result array: " + Arrays.toString(moveZeroesToEnd4(input)));

        Integer a=211;
        Integer b=211;
        Integer c=100;
        Integer d=100;
        //equal if in range(-128..127) :)
        //not equal outside this range (or use .equals() )
        // :)
        System.out.println(a+ (a==b?" equal to ":" not equal to ") +b);
        System.out.println(c+ (c==d?" equal to ":" not equal to ") +d);

    }

    private static int[] moveZeroesToEnd(int[] nums) {

        int length = nums.length, indexLeft = 0, indexRight = length - 1;
        int[] result = new int[length];

        for (int each : nums) {
            //if current element 0 -- put it to the right part of result array
            if (each == 0) result[indexRight--] = each;
                //if current element is not 0 -- put it to the left part of result array
            else result[indexLeft++] = each;
        }
        return result;
    }

    private static int[] moveZeroesToEnd1(int[] input) {

        int length = input.length, indexLeft = 0, indexRight = length - 1;

        while (indexLeft <= indexRight) {
            //let's find not zero element for the Right index
            if (input[indexRight] == 0) {
                indexRight--;
                continue;
            }
            //if current element at indexLeft is !=0 then swap values at indexLeft and indexRight
            if (input[indexLeft] == 0) {
                int tmp = input[indexLeft];
                input[indexLeft++] = input[indexRight];
                input[indexRight--] = tmp;
            }
            //or go to another element
            else indexLeft++;
        }
        return input;
    }

    private static int[] moveZeroesToEnd3(int[] nums) {

        int pointerFirst = 0, pointerSecond = 1;

        while (pointerSecond < nums.length) {

            if (nums[pointerFirst] == 0 && nums[pointerSecond] != 0) {
                nums[pointerFirst++] = nums[pointerSecond];
                nums[pointerSecond++] = 0;
            } else if (nums[pointerFirst] == 0 && nums[pointerSecond] == 0) {
                pointerSecond++;
            } else {
                pointerFirst++;
                pointerSecond++;
            }
        }
        return nums;
    }

    private static int[] moveZeroesToEnd4(int[] nums) {
        //let's assume that at index 0 we have zero element
        int indexOfFirstLeftZeroElement = 0;
        int tmp = 0;

        for (int i = 0; i < nums.length; i++) {
            //for any not zero element -- swap it
            if (nums[i] != 0) {
                tmp = nums[indexOfFirstLeftZeroElement];
                nums[indexOfFirstLeftZeroElement++] = nums[i];
                nums[i] = tmp;
            }

        }
        return nums;
    }


}
