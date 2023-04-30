package playingWithDenis;

import java.security.SecureRandom;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DiceThrow {
    static volatile int sumOfTries = 0, minThrows = Integer.MAX_VALUE, maxTrrows = Integer.MIN_VALUE;


    public static int[] throwDices(int numberOfDice) {
        int[] result = new int[numberOfDice+1];
        boolean allTheSame = true;
        Random secureRandom = new Random();

        for (int i = 1; i <= numberOfDice; i++) {
            result[i] = secureRandom.nextInt(6) + 1;
            if (i != 1) allTheSame &= result[i - 1] == result[i];
        }
        if(allTheSame) result[0]=1;else result[0]=0;
        return result;
    }

    public static void main(String... privet) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("How much dice will you throw?");
        int numberOfDice = sc.nextInt();
        System.out.println("How much attempts of getting similar dice do you want to do?");
        int numberOfAttempts = sc.nextInt();
        System.out.println("Calculating...");
        ExecutorService executorService = Executors.newFixedThreadPool(200);
        LocalTime start = LocalTime.now();


        for (int j = 0; j < numberOfAttempts; j++) {
            //  System.out.println("Attempt number " + j);
            Runnable toRun = () -> {
                for (int i = 0; true; i++) {
                    int [] result = throwDices(numberOfDice);
                    if (result[0]==1) {
                        // System.out.println("\t\t" + (1 + i) + " throws and we get: " + Arrays.toString(map.get(true)));
                        synchronized (DiceThrow.class) {
                            sumOfTries += i + 1;
                            minThrows = Math.min(minThrows, i + 1);
                            maxTrrows = Math.max(maxTrrows, i + 1);
                            System.out.print(".");
                        }
                        break;
                    }
                }
            };

            executorService.execute(toRun);


        }
        executorService.shutdown();


        while (!executorService.isTerminated()) {

        }
        long secondsSpent = start.until(LocalTime.now(), ChronoUnit.SECONDS);

        System.out.println();
        System.out.println("As for " + numberOfAttempts + " attempts we needed to throw "
                + numberOfDice + " dice " +
                sumOfTries / numberOfAttempts + " on average times to get all of them the same.");
        System.out.println("Min throws " + minThrows);
        System.out.println("Max throws " + maxTrrows);
        System.out.println("It took "+secondsSpent+ " seconds.");

    }


}
