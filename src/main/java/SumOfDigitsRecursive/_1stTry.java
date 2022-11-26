package SumOfDigitsRecursive;

public class _1stTry {

    public static void main(String[] args) {

        int num = 10128;
        System.out.println(sumOfDigits(num));
    }

    public static int sumOfDigits(int num) {
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }
        if (result < 10) return result;
        return sumOfDigits(result);
    }

}
