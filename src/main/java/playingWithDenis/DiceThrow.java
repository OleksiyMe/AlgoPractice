package playingWithDenis;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DiceThrow {
    static volatile int sumOfTries = 0, minThrows = Integer.MAX_VALUE, maxThrows = Integer.MIN_VALUE;


    //desiredNumber : 0 -- any; 1-6 -- just one side of the cube
    // output -- array with cube sides, first element of array 1 if matching, 0 if no
    public static int[] throwDice(int numberOfDice, int desiredNumber) {
        int[] result = new int[numberOfDice + 1];
        boolean allTheSame = true;
        //    if (desiredNumber!=0)

        Random secureRandom = new Random();

        for (int i = 1; i <= numberOfDice; i++) {
            result[i] = secureRandom.nextInt(6) + 1;
            if (i != 1) allTheSame &= result[i - 1] == result[i];
            else allTheSame &= result[1] == ((desiredNumber==0)? result[1]:desiredNumber);
        }
        if (allTheSame) result[0] = 1;
        else result[0] = 0;
        return result;
    }

    public static int[] throwDice(int numberOfDice) {
        return throwDice(numberOfDice, 0);
    }

    public static void main(String... privet) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many dice will you throw?");
        int numberOfDice = sc.nextInt();
        System.out.println("How many attempts of getting similar dice do you want to do?");
        int numberOfAttempts = sc.nextInt();
        System.out.println("Your desired number (1-6, 0 - for any)");
        int desiredNumber = sc.nextInt();
        System.out.println("Calculating...");
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        LocalTime start = LocalTime.now();


        for (int j = 0; j < numberOfAttempts; j++) {
            //  System.out.println("Attempt number " + j);
            Runnable toRun = () -> {
                for (int i = 0; true; i++) {
                    int[] result = throwDice(numberOfDice, desiredNumber);
                    if (result[0] == 1) {
                        System.out.println("\t\t" + (1 + i) + " throws and we get: " + Arrays.toString(result));
                        synchronized (DiceThrow.class) {
                            sumOfTries += i + 1;
                            minThrows = Math.min(minThrows, i + 1);
                            maxThrows = Math.max(maxThrows, i + 1);
                        }
                        //System.out.print(".");

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
                sumOfTries / numberOfAttempts + " times on average to get all of them the same.");
        System.out.println("Min throws " + minThrows);
        System.out.println("Max throws " + maxThrows);
        System.out.println("It took " + secondsSpent + " seconds.");

    }


}
