package FrogsQuarrelAndJumpUp;

public class FrogsQuarrelAndJumpUp1 {
    public static void main(String[] args) {

        Integer[] frogsScene = new Integer[]{1, 5, 5, 2, 6};
        System.out.println("max distance m-n+1 is " + findLongestDistance(frogsScene));

    }


    private static Integer findLongestDistance(Integer[] frogsScene) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < frogsScene.length; i++) {
            int index1 = i, index2 = i;

            while (index2 < frogsScene.length - 1) {
                if (frogsScene[index2] <= frogsScene[index2 + 1]) index2++;
                else break;
            }
            while (index1 > 0) {
                if (frogsScene[index1] <= frogsScene[index1 - 1]) index1--;
                else break;
            }
            max = Integer.max(index2 - index1 + 1, max);

        }
        return max;
    }

}
