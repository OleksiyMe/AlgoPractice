package MergeSortedArrays;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {
//        int[] nums1 = new int[]{0},
//                nums2 = new int[]{1};
//        int[] nums1 = new int[]{1},
//                nums2 = new int[]{0};
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0},
                nums2 = new int[]{2, 5, 6};
        merge(nums1, nums2);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] arr1, int[] arr2) {
        if (arr2.length == 0) return;
        for (int i = 0, j = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = arr2[j++];
                continue;
            }
            if (arr1[i] < arr2[j]) continue;

            shift(arr1, i);
            arr1[i] = arr2[j++];
        }
    }
    private static void shift(int[] arr, int i) {
        for (int j = arr.length - 1; j >= i; j--) {
            if (arr[j] == 0) continue;
            arr[j + 1] = arr[j];
        }
    }

    public static void merge2(int[] arr1, int[] arr2) {
        int n = arr2.length, m = arr1.length - n;
        for (int i = m, j = 0; i < m + n; i++) {
            arr1[i] = arr2[j++];
        }
        Arrays.sort(arr1);
    }


}
