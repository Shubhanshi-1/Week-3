package CountingSort;

public class Count {
    public static void countingSort(int arr[]){
        int largest =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest =Math.max(largest,arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //Sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
        System.out.println("Student's age after sorting: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
