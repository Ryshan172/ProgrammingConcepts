package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /*
    Given an array of integers nums and an integer target,
    return indices of the two numbers such that they add up to target.
     */

    public int[] twoSum(int[] nums, int target) {

        // Brute force solution

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{}; // no solution


    }

    public int[] twoSumAlt(int[] nums, int target) {

        Map<Integer, Integer> valueToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complementNum = target - nums[i];

            if (valueToIndex.containsKey(complementNum)) {
                return new int[] {valueToIndex.get(complementNum), i};
            }

            valueToIndex.put(nums[i], i);
        }

        return new int[0];



    }


}