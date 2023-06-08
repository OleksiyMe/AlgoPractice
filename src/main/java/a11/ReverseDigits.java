package a11;

import java.util.Scanner;

public class ReverseDigits {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your negative integer");
        int num =scanner.nextInt();

        System.out.println(reverseNegativeInt1(num));

    }

    public static int reverseNegativeInt(int num) {

        if (num>=0) throw new IllegalArgumentException("Number not negative");
        else num*=-1;
        String result="-";
        int divisor=10;

        while (num>0){
            result+= num%divisor;
            num=num/divisor;
        }
        return Integer.valueOf(result);
    }

    public static int reverseNegativeInt1(int num) {

        int result=0;
        int multiplier=(int)(Math.pow( 10, (int)Math.log10(Math.abs(num)) )  );

        while (num!=0){
            result+= num%10*multiplier;
            multiplier/=10;
            num=num/10;

        }
        return result;
    }




}
