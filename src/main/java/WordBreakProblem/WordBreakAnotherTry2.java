package WordBreakProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class WordBreakAnotherTry2 {
    public static void main(String[] args) {
        ArrayList<String> dic = new ArrayList<>(Arrays.asList(
                "cc", "ac","kadabra"
        ));
        String testWord = "kadabraccaccc";
        System.out.println("\n"+wordBreak(testWord, dic));
    }

    static HashSet<String> dictionary;

    public static boolean wordBreak(String s, List<String> wordDict) {
        dictionary = new HashSet<>(wordDict);

       // StringBuilder sb=new StringBuilder(); sb.
        return  wordBreak( s);

    }

    public static boolean wordBreak(String s) {

        int size = s.length();
        if (size == 0)   return true;

        // Create the DP table to store results of subproblems. The value wb[i]
        // will be true if str[0..i-1] can be segmented into dictionary words,
        // otherwise false.
        boolean []wb = new boolean[size+1];

        for (int i=1; i<=size; i++)
        {
            // if wb[i] is false, then check if current prefix can make it true.
            // Current prefix is "str.substring(0, i)"
            if (wb[i] == false && dictionary.contains( s.substring(0, i) ))
                wb[i] = true;

            // wb[i] is true, then check for all subStrings starting from
            // (i+1)th character and store their results.
            if (wb[i] == true)
            {
                // If we reached the last prefix
                if (i == size)
                    return true;

                for (int j = i+1; j <= size; j++)
                {
                    for (int k = 1; k <= size; k++) System.out.print(" " +  wb[k]);
                    System.out.println("^");
                    // Update wb[j] if it is false and can be updated
                    // Note the parameter passed to dictionaryContains() is
                    // subString starting from index 'i' and length 'j-i'
                    if (wb[j] == false && dictionary.contains( s.substring(i, j) ))
                        wb[j] = true;

                    // If we reached the last character
                    if (j == size && wb[j] == true)
                        return true;
                }
            }
        }

  //   Uncomment these lines to print DP table "wb[]"


        // If we have tried all prefixes and none of them worked
        return false;

    }


}
