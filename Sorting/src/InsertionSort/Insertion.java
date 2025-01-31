package InsertionSort;

public class Insertion {
    public static void insertionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr =arr[i];
            int prev =i-1;
            //Finding out current position to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
                //Insertion
                arr[prev+1]=curr;
            }

        }
        System.out.println("Employee id's after Sorting: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
