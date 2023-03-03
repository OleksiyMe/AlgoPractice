package b123.Maryna;

public class MedianOfThree {
    public static void main(String[] args) {

        int a = 10, b = -20, c = -5;
        String result = " is a median number";

        if (a < b && a > c || a < c && a > b) result = a +result;
        else if (b < c && b > a || b > c && b < a) result = b+result;
        else result = c+result;

        System.out.println(result);

    }
}
