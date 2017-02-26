package com.xinwei.java.leetcode.array;

/**
 * Created by xinweiwang on 2/21/17.
 */
/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n)
to hold additional elements from nums2. The number of elements initialized in nums1 and nums2
are m and n respectively.
*/

/*
    思路: merge sort 从后往前merge
 */
public class Merge_Sorted_Array {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1, j = n - 1, index = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) nums1[index--] = nums1[i--];
            else nums1[index--] = nums2[j--];
        }
        while (j >= 0) nums1[index--] = nums2[j--];

    }


}