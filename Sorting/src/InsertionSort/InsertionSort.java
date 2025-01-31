package InsertionSort;

public class InsertionSort {
    public static void main(String args[]){
        int arr[]= {101,108,105,103,106};
        System.out.println("Employee id before Sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        Insertion.insertionSort(arr);
    }
}
