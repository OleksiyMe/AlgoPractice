package b123.Maryna;

import java.util.Scanner;

public class CydeoBatches {
    public static void main(String[] args) {

        // System.out.println("Type the name of one of the batches\n(US morning, US evening, EU) ");
        String batchType = "US morning",
                toPrint = "";

        if (batchType.equals("US morning"))
                    toPrint = "Class times are 10-5 EST. M, T, Th, F.";

        else if (batchType.equals("US evening")) {
            toPrint = "Class times are 7-10 EST. M, T, W, Th, S, S";
        }else toPrint = "Class times are  1";
        System.out.println(toPrint);
    }
}
//    Create a class named CydeoBatches. In Cydeo we have three batch types: US morning, US evening, EU.
//        Depending on a batch type (String) print information about the batch.
//
//        If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
//        If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
//        If batch type is EU ==> print "Class times are  1
