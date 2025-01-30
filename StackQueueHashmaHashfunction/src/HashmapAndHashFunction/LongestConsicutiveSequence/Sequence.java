package HashmapAndHashFunction.LongestConsicutiveSequence;

import java.util.*;

class Sequence {
    public  int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);  // Store elements in a HashSet for O(1) lookups
        }

        int maxLength = 0;

        for (int num : numSet) {
            // Only check for sequence start (num - 1 should not exist)
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                // Count consecutive numbers
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }



}
