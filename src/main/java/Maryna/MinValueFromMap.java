package Maryna;

import java.util.Map;

public class MinValueFromMap {

    public static void main(String[] args) {
        //let us create test map
        Map<Character,Integer> map= Map.of(
                'a',1,'b',2, 'c',-34, 'd', -3
        );

        System.out.println("The minimum value from the map "+map+"\nis "+minVal(map));
    }

    public static int minVal(Map<Character, Integer> map) {

        int min=Integer.MAX_VALUE;
        //let us take values one-by-one and find minimum value
        for (Integer eachValue : map.values()) {
            if(eachValue<min)min=eachValue;
        }
        return min;
    }
}
