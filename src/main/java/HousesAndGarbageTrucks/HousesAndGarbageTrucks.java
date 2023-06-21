package HousesAndGarbageTrucks;

import java.util.HashMap;
import java.util.Map;

public class HousesAndGarbageTrucks {
    public static void main(String[] args) {

        int[] D ={2,5};
        String [] T={"PGP","M"};
        System.out.println("Shortest distance is "+solution(D,T));

    }

    private static int solution(int[] D, String[] T) {

        int truckP=0,truckG=0,truckM=0;

        Map<Integer, Map<Character,Integer>> map=new HashMap<>();

        for (int i=0;i<T.length;i++){
            Map<Character,Integer>tmpMap=new HashMap<>();
            String currString=T[i];
            for (int j = 0; j < currString.length(); j++) {
                char currChar=currString.charAt(j);
                tmpMap.put(currChar, tmpMap.getOrDefault(currChar,0)+1  );
            }
            map.put(i,tmpMap);
        }
        for (int i=0;i<D.length;i++){

            Map<Character,Integer> houseTrashMap=map.get(i);
            if (houseTrashMap.containsKey('P')){
                truckP+=D[i]*2+houseTrashMap.get('P');
            }
            if (houseTrashMap.containsKey('G')){
                truckG+=D[i]*2+houseTrashMap.get('G');
            }
            if (houseTrashMap.containsKey('M')){
                truckM+=D[i]*2+houseTrashMap.get('M');
            }

        }
        return (truckP>truckG&&truckP>truckM)?truckP:
                (truckG>truckP&&truckG>truckM)?truckG:truckM;
    }


}
