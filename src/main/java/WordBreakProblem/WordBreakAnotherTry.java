package WordBreakProblem;

import java.util.*;

public class WordBreakAnotherTry {
    public static void main(String[] args) {
        ArrayList<String> dic = new ArrayList<>(Arrays.asList(
                "cc", "ac"
        ));
        String testWord = "ccaccc";
        System.out.println(putBreakes(testWord, dic));
    }


        static HashSet<String> dictionary;

        public static boolean putBreakes(String s, List<String> wordDict) {
            dictionary = new HashSet<>(wordDict);
            return  putBreakes( s);
        }

        public static boolean putBreakes(String s) {

            int size = s.length();

            Map<Integer,String>map=new HashMap<>();
            Map<Integer,String>map1=new HashMap<>();
            StringBuilder sb=new StringBuilder();

            for(int i=0; i<size;i++){
                sb.append(s.charAt(i));
                map.put(i+1,sb.toString());
            }
            sb=new StringBuilder();
            for(int i=size-1; i>0;i--){
                sb.insert(0,s.charAt(i));
                map1.put(i+1,sb.toString());
            }
            if (size == 0)
                return true;

            for (int i = 1; i <= size; i++) {
                if (dictionary.contains(map.get(i)) &&
                        putBreakes(map1.get(i))) return true;
            }
            return false;

        }



      /*  HashSet<String> dictionary = new HashSet<>(wordDict);
        int size = s.length();

        // base case
        if (size == 0)
            return true;

        //else check for all words
        for (int i = 1; i <= size; i++) {
            // Now we will first divide the word into two parts ,
            // the prefix will have a length of i and check if it is
            // present in dictionary ,if yes then we will check for
            // suffix of length size-i recursively. if both prefix and
            // suffix are present the word is found in dictionary.

            if (dictionary.contains(s.substring(0, i)) &&
                    putBreakes(s.substring(i, size), wordDict))
                return true;
        }

        // if all cases failed then return false
        return false;*/
    }


