package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 2/14/17.
 */


/*
Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).
n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
Find two lines, which together with x-axis forms a container, such that the container contains the most water.
Note: You may not slant the container and n is at least 2.
*/

/*
    思路: two pointers
    running time: O(N)
 */

public class Container_With_Most_Water {

    public int maxArea(int[] height) {

        int max = 0;

        int i=0;
        int j=height.length-1;
        int current = 0;

        while(i<j){
            current = (j-i)*Math.min(height[i],height[j]);
            if(current>max){
                max=current;
            }
            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }

        }

        return max;
    }

}
