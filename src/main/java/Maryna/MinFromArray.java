package Maryna;

import java.util.Arrays;

public class MinFromArray {

    public static void main(String[] args) {

        int[]input ={1,6,3,8,2,0};
        System.out.println("The min element from array \n"+
                Arrays.toString(input)+
                "\nis "+findMin(input));
    }

    public static int findMin(int[] input) {
        int minElement=input[0];
        for (int i=1;i<input.length;i++){
            if(input[i]<minElement) minElement=input[i];
        }
        return minElement;
    }
}
