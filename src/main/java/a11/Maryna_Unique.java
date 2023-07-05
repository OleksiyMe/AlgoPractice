package a11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Maryna_Unique  implements Cloneable{
    /*   String_UniqueCharacters
     * Write a return  method that can find the unique characters from the String
     * Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */
    String m="M";
    int[] array={1,2,3};

    @Override
    public Maryna_Unique clone(){

        try {
            Maryna_Unique newInstance=(Maryna_Unique) super.clone();
            newInstance.array=array.clone();
            return newInstance;
        }catch (CloneNotSupportedException e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        String input = "AAABBBCCCDEF";



        System.out.println("Unique characters in " + input + " are: " +
                unique(input));
        Maryna_Unique m1=new Maryna_Unique();
        Maryna_Unique m2=m1.clone();
        System.out.println("m1 = " + m1);
        System.out.println("m2 = " + m2);
        System.out.println("m1.m = " + m1.m);
        System.out.println("m2.m = " + m2.m);
        System.out.println("m1.array = " + m1.array);
        System.out.println("m1.array = " + Arrays.toString(m1.array));
        System.out.println("m2.array = " + m2.array);
        System.out.println("m2.array = " + Arrays.toString(m2.array));
        m1.array[0]=99;
        System.out.println("m1.array = " + m1.array);
        System.out.println("m1.array = " + Arrays.toString(m1.array));
        System.out.println("m2.array = " + m2.array);
        System.out.println("m2.array = " + Arrays.toString(m2.array));

        System.out.println( m1.getClass()==m2.getClass());
        System.out.println(m1.getClass().getSimpleName());

    }

    public static String unique(String input) {
        Set<Character> setUnique = new HashSet<>();
        Set<Character> setNotUnique = new HashSet<>();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            Character ch = input.charAt(i);
            if (setNotUnique.contains(ch)) continue;
            if (!setUnique.add(ch)) {
                setUnique.remove(ch);
                setNotUnique.add(ch);
            }
        }
       //Class.forName()
        //DriverManager.getConnection();
       // Connection
        //ResultSet

        for (Character each : setUnique) {
            result += each;
        }
        return result;
    }
}
