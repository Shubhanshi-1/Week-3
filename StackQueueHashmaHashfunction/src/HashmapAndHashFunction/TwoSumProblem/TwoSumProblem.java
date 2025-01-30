package HashmapAndHashFunction.TwoSumProblem;

public class TwoSumProblem {
    public static void main(String[] args) {
        TwoSum twosum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        try {
            int[] result = twosum.twoSum(nums, target);
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
