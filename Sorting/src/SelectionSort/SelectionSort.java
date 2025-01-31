package SelectionSort;

public class SelectionSort {
    public static void main(String args[]){
        int arr[]= {78,45,89,90,65};
        System.out.println("University Student Marks before Sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Selection.selectionSort(arr);
    }
}

