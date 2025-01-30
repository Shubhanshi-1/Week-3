package StackAndQueues.SlidingWindowMaximum;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        SlidingWindow sliding = new SlidingWindow();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] maxValues = sliding.maxSlidingWindow(nums, k);

        System.out.print("Sliding Window Maximum: ");
        for (int num : maxValues) {
            System.out.print(num + " ");
        }
    }
}
