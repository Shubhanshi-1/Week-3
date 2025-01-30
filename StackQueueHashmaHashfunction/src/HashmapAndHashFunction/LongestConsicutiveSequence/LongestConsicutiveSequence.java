package HashmapAndHashFunction.LongestConsicutiveSequence;

public class LongestConsicutiveSequence {
    public static void main(String[] args) {
        Sequence sequence= new Sequence();
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence: " + sequence.longestConsecutive(arr));
    }
}

