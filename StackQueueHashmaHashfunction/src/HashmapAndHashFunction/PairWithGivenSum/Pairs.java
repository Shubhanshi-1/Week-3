package HashmapAndHashFunction.PairWithGivenSum;

import java.util.*;

class Pairs {
    public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                return true;  // Pair found
            }
            seen.add(num);
        }

        return false; // No pair found
    }
}
