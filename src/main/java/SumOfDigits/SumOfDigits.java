package SumOfDigits;

public class SumOfDigits {

    public static void main(String[] args) {

        int num = 1012;
        System.out.println(sumOfDigits(num));
    }

    public static int sumOfDigits(int num) {
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;

        }
        return result;
    }
}
