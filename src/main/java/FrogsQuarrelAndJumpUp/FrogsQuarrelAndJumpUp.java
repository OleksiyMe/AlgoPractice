package FrogsQuarrelAndJumpUp;

import java.util.ArrayList;

public class FrogsQuarrelAndJumpUp {
    public static void main(String[] args) {

        Integer[] frogsScene = new Integer[]{1, 5, 5, 2, 6};
         System.out.println("max distance m-n+1 is "+ findLongestDistance(frogsScene));

    }


    private static Integer findLongestDistance(Integer[] frogsScene) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < frogsScene.length; i++) {
            int index1 = i, index2 = i;

            for (int j = i; j < frogsScene.length - 1; j++) {
                if (frogsScene[j] <= frogsScene[j + 1]) index2 = j + 1;
                else break;
            }
            for (int j = i; j > 0; j--) {
                if (frogsScene[j] <= frogsScene[j - 1]) index1 = j - 1;
                else break;
            }
            max = Integer.max(index2 - index1 + 1, max);

        }
        return max;
    }

}
