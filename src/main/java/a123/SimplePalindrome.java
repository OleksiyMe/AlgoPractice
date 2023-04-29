package a123;

import java.util.HashMap;
import java.util.Hashtable;

public class SimplePalindrome {
    public static void main(String[] args) {

        String str = "race a car";

        System.out.println("Is string \"" + str + "\" a palindrome? " + isPalindrome(str));
      //  Character.isLetterOrDigit()
       // Character.toLowerCase()
//        StringBuilder sb = new StringBuilder();
//        sb.insert(0,ch);
    }





    public static boolean isPalindrome(String s) {
        int i=0, j=s.length()-1;

        while (i<j){
           char ch1=s.charAt(i), ch2=s.charAt(j);
           if (!Character.isLetterOrDigit(ch1)) {i++;continue;}
           if (!Character.isLetterOrDigit(ch2)) {j--;continue;}
           if (Character.toLowerCase(ch1)!=Character.toLowerCase(ch2))return false;
           i++;
           j--;
        }
        return true;
    }


    public static boolean isPalindrome2(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (Character.isLetterOrDigit(ch)) sb.insert(0,Character.toLowerCase(ch));
        }

        return sb.toString().equals(s);
    }


    private static boolean isPalindrome1(String s) {
        StringBuilder sb=new StringBuilder() , sb1=new StringBuilder();
        int length=s.length();
        for(int i=0;i<length;i++){
            char ch=s.charAt(i);
            char ch1=s.charAt(length-1-i);
            if (Character.isLetterOrDigit(ch)) sb.append(Character.toLowerCase(ch));
            if (Character.isLetterOrDigit(ch1)) sb1.append(Character.toLowerCase(ch1));
        }
        return sb.toString().equals(sb1.toString());
    }


    private static boolean isPalindromeTest(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (Character.isLetterOrDigit(ch)) sb.append(Character.toLowerCase(ch));
        }
        s=sb.toString();
        int length=s.length();

        for (int i=0;i<length/2;i++){
            if(s.charAt(i)!=s.charAt(length-1-i)) return false;
        }

//        HashMap<Integer,Integer> map =new HashMap<>();
//        map.
        return true;


    }
}
