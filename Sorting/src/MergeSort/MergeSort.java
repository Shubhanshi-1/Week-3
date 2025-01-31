package MergeSort;
import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        double[] bookPrices = {199.99, 49.99, 150.50, 89.75, 120.00, 175.25};
        Merge.mergeSort(bookPrices, 0, bookPrices.length - 1);
        System.out.println("Sorted Book Prices: " + Arrays.toString(bookPrices));
    }
}
