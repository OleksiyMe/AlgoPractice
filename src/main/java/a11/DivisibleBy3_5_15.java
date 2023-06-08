package a11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DivisibleBy3_5_15 {

    public static void main(String[] args) {

        ArrayList<Integer> divisibleBy3=new ArrayList<>(),
                divisibleBy5=new ArrayList<>(),
                divisibleBy15=new ArrayList<>();

        for (int i = 1; i <101 ; i++) {
            if (i%15==0){divisibleBy15.add(i); continue; }
            if (i%3==0)divisibleBy3.add(i);
            if (i%5==0)divisibleBy5.add(i);

        }
        System.out.println("Divisible by 15: "+divisibleBy15.toString()
                .replace("[","").replace("]",""));
        System.out.println("Divisible by 5: "+divisibleBy5.toString()
                .replace("[","").replace("]",""));
        System.out.println("Divisible by 3: "+divisibleBy3.toString()
                .replace("[","").replace("]",""));

//        String sub="ABBAE";
//        Set<Character> set =new HashSet();
//        for (int i=0; i<sub.length();i++){
//            if (!set.add(sub.charAt(i))) set.remove(sub.charAt(i));
//
//        }
//        System.out.println("Unique chars in "+sub+" "+set.size());
    }
}


//Numbers -- Divisible by 3, 5, 15
//        Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
//        if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15 section
//        if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3 section
//        if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5 section
//        ex:
//        OutPut:
//        Divisible By 15 15 30 45 60 75 90
//        Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
//        Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
