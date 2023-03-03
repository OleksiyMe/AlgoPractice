package Permutation;

public class Permutation5 {

    public static void main(String[] args) {

        String str = "abcdef";
        printPermutations(str);
    }

    private static void printPermutations(String str) {
        printPermutations(str, "");
    }

    private static void printPermutations(String str, String pivot) {

        if (str.length() == 0) System.out.print(pivot + ", ");

        for (int i = 0; i < str.length(); i++) {
            String stringToPermute = str.substring(0, i) + str.substring(i + 1),
                    fixedPart = pivot + str.charAt(i);
            printPermutations(stringToPermute, fixedPart);
        }


    }

}
