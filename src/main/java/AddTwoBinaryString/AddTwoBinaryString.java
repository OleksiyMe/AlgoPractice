package AddTwoBinaryString;

import java.math.BigInteger;

public class AddTwoBinaryString {

    public static void main(String[] args) {

//        String a = "11";
//        String b = "1";
        String a =  "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        System.out.println(addBinary(a,b));



    }

    public static String addBinary(String a, String b) {

        BigInteger num_a = new BigInteger("0"), num_b = new BigInteger("0");
        for (int i = 0; i < a.length(); i++) {
            num_a = num_a.multiply(new BigInteger("2")).add( new BigInteger(""+(a.charAt(i) - '0')));

        }
        for (int i = 0; i < b.length(); i++) {
            num_b = num_b.multiply(new BigInteger("2")).add( new BigInteger(""+(b.charAt(i) - '0')));
        }
        num_a=num_a.add(num_b);
        StringBuilder sb = new StringBuilder();
        do  {
            sb.insert(0, num_a.remainder(new BigInteger("2")));
            num_a=num_a.divide(new BigInteger("2"));
        }while (!num_a.equals(new BigInteger("0")));
        return sb.toString();
    }
}
