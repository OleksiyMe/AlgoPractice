package StringToIntegerATOI;

public class _4thTry {

    public static void main(String[] args) {

        String s = "4193 with words";
        System.out.println("The string is: " + s);
        System.out.println("The Number is: " + myAtoi(s));
    }

    private static int myAtoi(String s) {

        char[] str =s.toCharArray();
        int sign = 1, base = 0, i = 0;

        // if whitespaces then ignore.
        while (str[i] == ' ')
        {
            i++;
        }

        // sign of number
        if (str[i] == '-' || str[i] == '+')
        {
            sign = 1 - 2 * (str[i++] == '-' ? 1 : 0);
        }

        // checking for valid input
        while (i < str.length
                && str[i] >= '0'
                && str[i] <= '9') {

            // handling overflow test case
            if (base > Integer.MAX_VALUE / 10
                    || (base == Integer.MAX_VALUE / 10
                    && str[i] - '0' > 7))
            {
                if (sign == 1)
                    return Integer.MAX_VALUE;
                else
                    return Integer.MIN_VALUE;
            }
            base = 10 * base + (str[i++] - '0');
        }
        return base * sign;
    }


}





