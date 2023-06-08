package a11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

public class CountUniqueChInAllSubstrings {


    static int sum = 0;


    public static void main(String[] args) {
        System.out.println(uniqueLetterString("LEETCODE"));
    }

    public static int uniqueLetterString(String s) {

        substrings(s);
        return sum;
    }

    private static void substrings(String input) {

        int minLength = 1, currentLength = minLength;
        final int maxLength = input.length();
        ExecutorService exec = Executors.newCachedThreadPool();


        while (currentLength <= maxLength) {
            final int current = currentLength;

            //exec.


            exec.execute(() -> {
                for (int i = 0; i < maxLength; i++) {
                    if ((i + current) <= maxLength) {
                        synchronized (CountUniqueChInAllSubstrings.class) {

                            sum += countUniqueChars(input.substring(i, i + current));
                        }

                    }
                }
            });
            currentLength++;

        }
        exec.shutdown();
        while (!exec.isTerminated()) {
        }

    }

    public static int countUniqueChars(String sub) {
        Set<Character> set = new HashSet<>(),
                notUnique = new HashSet<>();
        for (Character each : sub.toCharArray()) {
            if (notUnique.contains(each)) continue;
            if (set.contains(each)) {
                notUnique.add(each);
                set.remove(each);
            }else set.add(each);

        }

        return set.size();
    }


}
