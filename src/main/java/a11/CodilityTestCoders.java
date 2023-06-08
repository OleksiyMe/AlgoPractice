package a11;

import java.util.Scanner;

public class CodilityTestCoders {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int num = s.nextInt();

        for (int i = 1; i <= num; i++) {
            boolean isSubstituted=false;
            if (i % 2 == 0) {System.out.print("Codility"); isSubstituted=true;}
            if (i % 3 == 0) {System.out.print("Test");isSubstituted=true;}
            if (i % 5 == 0) {System.out.print("Coders");isSubstituted=true;}
            if (isSubstituted) System.out.println();
            else System.out.println(i);
        }


    }
}


//    Write a function that, given a positive integer N, prints the consecutive numbers
//        from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5
//        should be replaced by the word Codility, Test or Coders respectively. If a number
//        is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by
//        a concatenation of the respective words Codility, Test and Coders in this given order.
//        For example, numbers divisible by both 2 and 3 should be replaced by CodilityTest and
//        numbers divisible by all three numbers: 2,3 and 5, should be replaced by
//        CodilityTestCoders.Write a function that, given a positive integer N, prints the
//        consecutive numbers from 1 to N, each on a separate line. However, any number
//        divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders
//        respectively. If a number is divisible by more than one of the numbers: 2,3 or 5,
//        it should be replaced by a concatenation of the respective words Codility, Test and
//        Coders in this given order. For example, numbers divisible by both 2 and 3 should be
//        replaced by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should
//        be replaced by CodilityTestCoders.

//    For example, here is the output for N = 17:
//        1
//        Codility
//        Test
//        Codility
//        Coders
//        CodilityTest
//        7
//        Codility
//        Test
//        CodilityCoders
//        11
//        CodilityTest
//        13
//        Codility
//        TestCoders
//        Codility
//        17