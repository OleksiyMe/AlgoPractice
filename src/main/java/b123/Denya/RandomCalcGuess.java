package b123.Denya;

import java.util.Random;
import java.util.Scanner;

public class RandomCalcGuess {
    public static void main(String[] args) {

        Random r = new Random();
        Scanner s = new Scanner(System.in);
        while (true) {
            int a = r.nextInt(11)-1, b = r.nextInt(11)-1;
            String[] operations = {"+", "-", "/", "*"};
            String operation = operations[r.nextInt(4)];

            System.out.println("Calculate (only integers) " + a + operation + b + "=");

            int answer = s.nextInt(), result = Integer.MAX_VALUE;
            switch (operation) {

                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "/":
                    result = a / b;
                    break;
                case "*":
                    result = a * b;
                    break;
            }
            if (answer == result) System.out.println("You are right. " + result + " is right result");
            else System.out.println("You are wrong. " + answer + " is wrong result\nright result is " + result);
            System.out.println("Enter STOP to stop or GO to go");
            if (s.next().equals("STOP")) break;

        }
    }
}
