package Maryna;

import java.util.Arrays;

public class SortDescending {

    public static void main(String[] args) {
        int[]input ={1,-7,8,4,99,3};
        System.out.println("Our input array \n"+
                Arrays.toString(input));
        System.out.println("Our descending sorted array \n"+
                Arrays.toString(sortDesc(input)));

    }

    public static int[] sortDesc(int[] input) {

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length-1; j++) {
                if(input[j]<input[j+1]){
                    int tmp=input[j];
                    input[j]=input[j+1];
                    input[j+1]=tmp;
                }
            }
        }
        return input;
    }


}
