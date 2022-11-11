package StringToIntegerATOI;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TryMyRegex {
    public static void main(String[] args) {

        String s1 ="    1234124sdfafs";
        String s2 ="    -1234124sdfafs";
        String s3 ="    -+1234124sdfafs";

       // String regex ="^(\\s*\\d+)|(\\s*-?\\d+)|(\\s*\\Q+\\E?\\d+)";
       // String regex ="^\\s*(-|\\Q+\\E)?\\d+";
        String regex ="^\\s*[-\\Q+\\E]?\\d+";
       /* do the following: start, any or no one ' ', one + or - or no one,
       then one or more digits

        +  -- means one or more
       * -- means no one, one or more
        ? -- no one or one
       \\Q+\\E   -- special type of escaping for + sign*/

        Pattern pattern = Pattern.compile(regex);  //creating a Pattern object

        Matcher matcher1 = pattern.matcher(s1);      //creating a Matcher object for s1
        Matcher matcher2 = pattern.matcher(s2);      //creating a Matcher object for s2
        Matcher matcher3 = pattern.matcher(s3);      //creating a Matcher object for s3


        System.out.println("s1: "+ s1+"\n"+
                ((matcher1.find()) ? matcher1.group(): "No match")
                );
        System.out.println("s2: "+ s2+"\n"+
                ((matcher2.find()) ? matcher2.group(): "No match")
        );
        System.out.println("s3: "+ s3+"\n"+
                ((matcher3.find()) ? matcher3.group(): "No match")
        );



    }
}
