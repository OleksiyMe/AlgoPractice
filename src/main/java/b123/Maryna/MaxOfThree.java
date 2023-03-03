package b123.Maryna;

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 numbers and i will give you the max:-\nor enter stop");
        String input="";
        while (!input.toLowerCase().equals("stop")){
        int a = Integer.valueOf(sc.next());
        int b = Integer.valueOf(sc.next());
        int c = Integer.valueOf(sc.next());
        int max;
        max = (a > b && a > c) ? a : (b > a && b > c) ? b : (c > a && c > b) ? c : (a == b && b == c) ? a : 0;

        System.out.println("the heigest number is:" + max);
        }

    }
}