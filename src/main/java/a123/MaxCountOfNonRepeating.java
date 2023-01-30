package a123;

import java.util.HashSet;

public class MaxCountOfNonRepeating {

    public static void main(String[] args) {

        String str= "aabcdcaaabcdedcaaabc";

        System.out.println("Count of nonrepeating is "+countNonRep(str));
    }

    private static int countNonRep(String s) {
        HashSet<Character> set =new HashSet<>();
        int max=0, count=0, start=0;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(set.add(s.charAt(i))){
                count++;
            } else {
                max=Math.max(max,count);
                count=0;
                start++;
                i=start-1;
                set=new HashSet<>();
            }
        }
        return Math.max(count,max);

    }
}
