package b123.Denya;

import java.util.*;

public class LetterCount {
    public static void main(String[] args) {


        Scanner s =new Scanner(System.in);
        System.out.println("Enter your word ");
        String str=s.nextLine();
        Map<Character, Integer> map =new TreeMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map.toString().replace("{","").replace("}",""));

    }
}
