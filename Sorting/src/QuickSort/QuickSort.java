package QuickSort;

import java.util.*;
public class QuickSort {

    public static void main(String[] args) {
        double[] productPrices = {299.99, 149.99, 499.50, 89.75, 120.00, 175.25};
        Quick.quickSort(productPrices, 0, productPrices.length - 1);
        System.out.println("Sorted Product Prices: " + Arrays.toString(productPrices));
    }
}
