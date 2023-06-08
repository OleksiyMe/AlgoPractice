package a11;

import java.util.ArrayList;
import java.util.List;

public class PermuteString {

    private static List<String> result = new ArrayList<>();

    public static void main(String[] args) {

        String input = "ABC";
        permute(input);
        System.out.println(result);
        System.out.println("Size " + result.size());
    }

    private static void permute(String input) {
        permute("", input);
    }

    private static void permute(String fixed, String input) {

        if (input.length() == 1) {
            result.add(fixed + input + " ");
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            String prefix = fixed + input.charAt(i),
                    suffix = input.substring(0, i) + input.substring(i + 1);

            permute(prefix, suffix);

        }

    }

}
