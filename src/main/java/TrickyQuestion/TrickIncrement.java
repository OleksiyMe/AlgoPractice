package TrickyQuestion;

import java.util.Comparator;

public class TrickIncrement {
    public static void main(String[] args) {

        int j = 0;
        for (int i = 0; i < 10; i++) {
            //j = j++;  //0
            j = ++j;    //10
        }
        System.out.println(j);
//        Comparator<String> abc = (one, two) -> {
//            return 1;
//        };
    }
}

