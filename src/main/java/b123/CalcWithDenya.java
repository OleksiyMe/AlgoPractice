package b123;

import java.util.Scanner;

public class CalcWithDenya {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter first and second numbers");
        int first = s.nextInt();
        int second = s.nextInt();
        System.out.println("enter operation (+,-,/,*)");
        String operation = s.next();
        switch (operation) {
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "/":
                System.out.println(first / second);
                break;
            case "*":
                System.out.println(first * second);
                break;
        }
    }
}
