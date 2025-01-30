package HashmapAndHashFunction.TwoSumProblem;

import java.util.*;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if complement exists in map
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i}; // Return the indices
            }

            // Store the current number and its index in the map
            map.put(nums[i], i);
        }

        // If no solution found, return an empty array
        throw new IllegalArgumentException("No two sum solution");
    }

}
