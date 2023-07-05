package Maryna;

import java.util.Arrays;

public class MaxFromArray {

    public static void main(String[] args) {

        int[]input ={1,6,3,8,2,0};
        System.out.println("The max element from array \n"+
                Arrays.toString(input)+
                "\nis "+ findMax(input));
    }

    public static int findMax(int[] input) {
        int maxElement=input[0];
        for (int i=1;i<input.length;i++){
            if(input[i]>maxElement) maxElement=input[i];
        }
        return maxElement;
    }
}
