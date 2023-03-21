package b123.Maryna;

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 numbers and i will give you the max:-\nor enter stop");
        String input = "";
        while (!input.toLowerCase().equals("stop")) {
            int a = Integer.valueOf(sc.next());
            int b = Integer.valueOf(sc.next());
            int c = Integer.valueOf(sc.next());
            int max;
            max = (a > b && a > c) ? a : (b > a && b > c) ? b : (c > a && c > b) ? c : (a == b && b == c) ? a : 0;

            System.out.println("the max number is:" + max);
            System.out.println("stop?");
            input=sc.next();
        }
        String s1 = "abc";
        String s2 = new String("abc");
        String s3=s2.intern();
        System.out.println(s1==s3);
        System.out.println(s1+s2+s3);


    }

}