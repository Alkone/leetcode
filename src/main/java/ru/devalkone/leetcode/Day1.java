package ru.devalkone.leetcode;

import java.util.Arrays;

public class Day1 {
    public static void main(String[] args) {
        var testArray = new int[]{-1, -1, 0, 1, 1, 0};
//        System.out.println(Arrays.toString(runningSum(testArray)));
        System.out.println(pivotIndex(testArray));
    }

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        return nums;
    }

    public static int pivotIndex(int[] nums) {
        int leftSum = 0, sum = Arrays.stream(nums).sum();

        for (int i = 0; i < nums.length; i++) {
            if (leftSum == sum - leftSum - nums[i]) return i;
            leftSum += nums[i];
        }

        return -1;
    }

}
