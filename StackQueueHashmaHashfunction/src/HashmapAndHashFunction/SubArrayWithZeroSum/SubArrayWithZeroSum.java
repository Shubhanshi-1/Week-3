package HashmapAndHashFunction.SubArrayWithZeroSum;

import java.util.List;

public class SubArrayWithZeroSum {
    public static void main(String[] args) {
        SubArray subArray = new SubArray();
        int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        List<int[]> subarrays = subArray.findZeroSumSubarrays(arr);

        System.out.println("Subarrays with sum zero:");
        for (int[] sub : subarrays) {
            System.out.println("Start: " + sub[0] + ", End: " + sub[1]);
        }
    }
}
