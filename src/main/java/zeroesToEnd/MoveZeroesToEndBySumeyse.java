package zeroesToEnd;

import java.util.Arrays;

public class MoveZeroesToEndBySumeyse {
    public static void main(String[] args) {
        int[] given = {0, 1, 0, 0, 0, 2, 2, 2, 0, 0, 7};
        System.out.println(Arrays.toString(moveZeroesToEnd(given)));
    }

    public static int[] moveZeroesToEnd(int[] arr) {

        int fast = 0, slow = 0;
        while (fast < arr.length - 1) {

            if (arr[slow] != 0) {
                slow++;
            }
            if (fast <= slow || arr[fast] == 0) {
                fast++;
            }
            if (arr[slow] == 0 && arr[fast] != 0) {
                arr[slow] = arr[fast];
                arr[fast] = 0;
            }
        }
        return arr;
    }
}
