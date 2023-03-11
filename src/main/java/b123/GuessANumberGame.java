package b123;

import java.util.Scanner;

public class GuessANumberGame {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int number = 0, guess = 100,  rangeMax = 101, rangeMin = -1;
        System.out.println("Pick a number Human (from 1 to 100)");
        number = s.nextInt();
        while (rangeMax-rangeMin != 1) {
            guess = rangeMin+(rangeMax - rangeMin) / 2;
            System.out.println("Range is "+ rangeMin+" - "+rangeMax);
            System.out.println("Are your number >" + guess + "(y,n)");
            if (s.next().equals("y")) {
                rangeMin = guess;
            } else rangeMax = guess;
        }
        System.out.println("Your number is " + (rangeMax));

    }
}
