package BubbleSort;

public class Bubble {
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]) {
                    //Swapping
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Marks after sorting: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
