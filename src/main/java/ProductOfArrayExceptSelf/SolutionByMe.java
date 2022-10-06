package ProductOfArrayExceptSelf;
import java.util.Arrays;
public class SolutionByMe {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    private static int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] prefix = new int[length];
        int[] postfix = new int[length];

        for (int i = 0; i < length; i++) {
            if (i == 0) prefix[i] = 1;
            else prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        for (int i = length - 1; i >= 0; i--) {
            if (i == length - 1) postfix[i] = 1;
            else postfix[i] = postfix[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < length; i++) {
            nums[i] = postfix[i] * prefix[i];
        }
        return nums;
    }}
 /*   given array      1,  2,  3,  4

        expected result 24,  12, 8,  6

we can divide factors for our expected products in two groups: prefix and postfix.
let us do it for each element of expected result. First element in prefixes and last
in postfixes are 1, because we have no factors outside the given array.

        24    1 (prefix) 		*  (2*3*4)(postfix) 			1 * 24
        12    (1) (prefix)    	*  (3*4) (postfix)			    1*  12
        8     (2*1) (prefix) 	*  (4)	(postfix)	        	2*  4
        6     (1*2*3) (prefix)  *   1 (postfix)			    	6*  1

        1  1  2 6     prefix   getting it in a first loop
        24 12 4 1	postfix   getting it in a second loop

        multiplying elements of prefix and postfix in a third loop and getting result

        24 12 8 6

        */
