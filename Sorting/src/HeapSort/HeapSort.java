package HeapSort;

import java.util.*;
public class HeapSort {
    public static void main(String[] args) {
        double[] salaries = {50000, 75000, 60000, 85000, 70000, 65000};
        Heap.heapSort(salaries);
        System.out.println("Sorted Salary Demands: " + Arrays.toString(salaries));
    }
}
