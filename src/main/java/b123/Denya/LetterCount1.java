package b123.Denya;

import java.util.*;
import java.util.stream.Collectors;

public class LetterCount1 {
    public static void main(String[] args) {


        Scanner s =new Scanner(System.in);
        System.out.println("Enter your word ");
        String str=s.nextLine();
        Map<String, Long> map ;
        map= Arrays.stream( str.split(""))
                .collect(  Collectors.groupingBy(p->p,Collectors.counting())  )
                .entrySet().stream()
             //   .collect(Collectors.toMap(p->p.getKey(),p->p.getValue(), (pOld,pNew)->pNew, TreeMap::new));
               //  .sorted((a,b)->a.getKey().toLowerCase().charAt(0)<=b.getKey().toLowerCase().charAt(0)?-1:1)
                .sorted((a,b)->a.getKey().compareToIgnoreCase(b.getKey()))
                .collect(Collectors.toMap(p->p.getKey(),p->p.getValue(), (pOld,pNew)->pNew, LinkedHashMap::new));


        System.out.println(map.toString().replace("{","").replace("}",""));




    }
}
