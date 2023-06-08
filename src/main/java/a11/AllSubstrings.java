package a11;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AllSubstrings {
    public static void main(String[] args) {

        String input = "LEETCODEDXFGHDFHSDFHSDFJHSDRTUHSREHTSHSRTHUSRTSDRGSERYWERYTAER";

        substrings(input);

//        Constructor<AllSubstrings> constructor=AllSubstrings.class.getConstructor();
//        AllSubstrings allSubstrings=constructor.newInstance();

    }

    private static void substrings(String input) {

        int  maxLength = input.length(), currentLength = 1;
        ExecutorService exec = Executors.newCachedThreadPool();
        while (currentLength <= maxLength) {
            final int current = currentLength;
            exec.execute(() -> {
                for (int i = 0; i < maxLength; i++) {
                    if ((i + current) <= maxLength) System.out.println(input.substring(i, i + current));
                    //else System.out.println(input.substring(i));
                }
            });
            currentLength++;

        }
        exec.shutdown();
        while (!exec.isTerminated()) {
        }

    }
}
