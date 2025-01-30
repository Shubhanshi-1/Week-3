package HashmapAndHashFunction.SubArrayWithZeroSum;
import java.util.*;

class SubArray {
    public  List<int[]> findZeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> sumMap = new HashMap<>();
        List<int[]> result = new ArrayList<>();
        int sum = 0;

        // Add an initial entry to handle cases where sum is zero from the start
        sumMap.put(0, new ArrayList<>());
        sumMap.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If sum exists in map, it means subarrays with zero sum exist
            if (sumMap.containsKey(sum)) {
                for (int start : sumMap.get(sum)) {
                    result.add(new int[]{start + 1, i});
                }
            }

            // Store sum and corresponding index
            sumMap.putIfAbsent(sum, new ArrayList<>());
            sumMap.get(sum).add(i);
        }

        return result;
    }

}
