package HashmapAndHashFunction.PairWithGivenSum;

public class PairWithGivenSum {
    public static void main(String[] args) {
        Pairs pair = new Pairs();
        int[] arr = {10, 15, 3, 7};
        int target = 17;

        if (pair.hasPairWithSum(arr, target)) {
            System.out.println("Pair exists.");
        } else {
            System.out.println("No pair found.");
        }
    }
}
