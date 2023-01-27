package a123;

import java.util.HashSet;

public class MaxCountOfNonRepeating {

    public static void main(String[] args) {

        String str= "abccabcdaaabcde";

        System.out.println("Count of nonrepeating is "+countNonRep(str));
    }

    private static int countNonRep(String str) {
        HashSet<Character> set =new HashSet<>();
        int max=0, count=0, start=0;
        for (int i = 0; i < str.length(); i++) {
            if(set.add(str.charAt(i))){
                count++;
            } else {
                max=Math.max(max,count);
                count=0;
                start++;
                i=start;
                set=new HashSet<>();
            }
        }
        return Math.max(count,max);

    }
}
