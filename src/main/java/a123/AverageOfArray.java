package a123;

import java.util.Arrays;

public class AverageOfArray {

    public static void main(String[] args) {

        int[] array = {99, 0,99 ,0, 99};
        System.out.println((average(array)));
        System.out.println(boxAverage(array));
    }

    private static int average(int[] array) {

        int average=0; int sum=0;

        for (int i = 0; i < array.length; i++) {
            sum=sum+array[i];
            average=sum/(i+1);
        }
        return average;
        }

    private static int boxAverage(int[] array) {

        int min=Integer.MAX_VALUE; int max=Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            min=Integer.min(min,array[i]);
            max=Integer.max(max,array[i]);
        }
        return (int)Math.ceil((min+max)/2.0);
    }



}
