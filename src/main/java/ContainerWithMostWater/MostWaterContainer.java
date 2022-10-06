package ContainerWithMostWater;

import java.util.Arrays;

public class MostWaterContainer {

    public static void main(String[] args) {
        int[] given = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("For our array of heights: \n" + Arrays.toString(given));
        System.out.println("Max water volume is: " + maxWaterVolume(given));
    }

    private static int maxWaterVolume(int[] given) {
        int maxArea = 0;   //
        int leftPointer = 0, rightPointer = given.length - 1;

        while (leftPointer != rightPointer) {
            int area = Math.min(given[leftPointer], given[rightPointer]) * (rightPointer - leftPointer);
            if (area > maxArea) maxArea = area;
            // maxArea=Math.max(maxArea,area);
            if (given[leftPointer] < given[rightPointer]) leftPointer++;
            else rightPointer--;
        }
        return maxArea;
    }
}

/*
You are given an integer array of heights of length n. There are n vertical lines drawn such that
the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains
the most water. Return the maximum amount of water a container can store.

Area between two vertical lines always will be
Area= min(H_right,H_left)* (Index_right-Index_left)

We assign calculated area to maxArea if it is greater than the value stored in maxArea.

To test new area (as if we are looking for max) we always move the pointer (left or right) which points
to smaller line height. If both line heights are equal we move right pointer (in this case we can move any of them
(or even both??)).

finally, when our pointers are equal we return maxArea

*/