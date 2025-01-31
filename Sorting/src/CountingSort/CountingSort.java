package CountingSort;

public class CountingSort {
    public static void main(String args[]){
        //Students age ranging from 10 to 18
        int arr[] = {12,15,10,18,12,14,16,13,11,12,17,18};
        System.out.println("Student's age before Sorting: ");
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
        System.out.println();
        Count.countingSort(arr);

    }
}
