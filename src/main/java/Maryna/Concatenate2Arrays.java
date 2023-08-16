package Maryna;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Concatenate2Arrays {
    //Write a return method that can concatenate two arrays

    public static void main(String[] args) {


        int[]arr1=new int[]{1,2,3};
        int[]arr2=new int[]{1,2,3};

        System.out.println("We had \n"+ Arrays.toString(arr1)+" and "+Arrays.toString(arr2));

        System.out.println("We get \n"+Arrays.toString(concatenate(arr1,arr2)));
    }

    public static int[] concatenate(int[] input1, int[] input2) {
        //let us create result array with length equal sum of lengths of input arrays
        int [] result=new int[input1.length+ input2.length];
        //defining variable for result array index
        int resultIndex=0;

        //iterating through first input array and assign its elements to element of result array with
        //current resultIndex. After assignment, we increment resultIndex
        for (int each:input1){
            result[resultIndex++]=each;
        }
        //iterating through second input array and assign its elements to element of result array with
        //current resultIndex. After assignment, we increment resultIndex
        for (int each:input2){
            result[resultIndex++]=each;
        }

        return result;
    }

}
