import java.util.*;

public class Practice {

    // Use a hashmap to find the element appearing an odd number of times in an array:
    public int[] twoSum(int[] nums, int target) {

        //int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++ ) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }

        return new int[] {}; // no solution




    }









}
