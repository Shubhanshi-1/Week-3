package BubbleSort;


public class BubbleSort {
    public static void main(String args[]){
        //Student marks in 5 subjects
       int arr[]= {58,33,89,44,96};
       System.out.println("Marks of student before sorting");
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
       System.out.println();
       Bubble.bubbleSort(arr);

    }
}
