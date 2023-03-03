package AddTwoBinaryString;

import java.math.BigInteger;

public class AddTwoBinaryString1 {

    public static void main(String[] args) {

        String a = "11";
        String b = "1";
//        String a =  "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
//        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        System.out.println(addBinary(a, b));


    }

    public static String addBinary(String a, String b) {

        int a_index = a.length() - 1, b_index = b.length() - 1, toCarry = 0, sum = 0;
        StringBuilder sb = new StringBuilder();

        while (a_index >= 0 || b_index >= 0 || toCarry>0) {

            sum = toCarry;
            if (a_index >= 0) sum += a.charAt(a_index--) - '0';
            if (b_index >= 0) sum += b.charAt(b_index--) - '0';

            toCarry = sum / 2;
            sb.append((sum%2==0)?0:1);
        }

        return sb.reverse().toString();
    }
}
