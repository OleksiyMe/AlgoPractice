package PlayWithFunctionalInterfaces;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.function.Supplier;

public class TestSupplier {
    public static void main(String[] args) {

        Supplier<Character> giveMeRandomLetter = () -> (char) (new Random().nextInt(26) + 65);

        for (int i = 0; i < 1000; i++) {
            System.out.print(giveMeRandomLetter.get() + "  ");
        }

        Supplier<String> giveMe1000RandomLetters = () ->
        {
            StringBuilder sb = new StringBuilder().append(" ");
            Random rnd = new Random();
            for (int i = 0; i < 1001; i++) {
                sb.append((char) (rnd.nextInt(26) + 65)).append("  ");
            }
            return sb.toString();
        };
        System.out.println("==========================");
        String test = giveMe1000RandomLetters.get();
        System.out.println(test);

        Map<Character, Integer> freqOfChar = new TreeMap<>();
        for (int i = 0; i < test.length(); i++) {
            char ch = test.charAt(i);
            if (ch == ' ') continue;
            freqOfChar.put(ch, freqOfChar.getOrDefault(ch, 0) + 1);
        }
        System.out.println(freqOfChar);
    }
}
