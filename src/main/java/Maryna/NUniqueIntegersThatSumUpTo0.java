package Maryna;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NUniqueIntegersThatSumUpTo0 {
    //
//            2️⃣  NUniqueIntegersThatSumUpTo0
//    Write a function that, given an integer N (1 < N < 100), returns an array containing N unique
//    integers that sum up to 0.
//    The function can return any such array. For example, given N = 4,
//    the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].
//    The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).
//    For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter number from 1 to 100 to run or any other to stop");
            int length = sc.nextInt();
            if (length<=0||length>100) break;
            System.out.println(Arrays.toString(buildArrayWith0SumOfElements(length)));
        }
        System.out.println("Have a great day ahead!");
    }

    private static int[] buildArrayWith0SumOfElements(int length) {
        //we need this Random object for getting our elements
        Random random = new Random();
        //we need this sum variable for calculating the last element
        int sum = 0;
        //let us create int aray with desired length
        int[] result = new int[length];
        //let's assign elements one by one to array
        for (int i = length-1; i >0; i--) {
            //let us get random sign ("+" or "-") for our element
            int sign =random.nextBoolean()?1:-1;
            //let us get our random number from 0 to 10, add sign to it, and assign to current array element
            result[i] = random.nextInt(11) * sign;
            //add current element to sum
            sum += result[i];
        }
        //assign the last number to array, so that sum of all elements will be 0
        result[0] = -sum;
        return result;
    }
}
