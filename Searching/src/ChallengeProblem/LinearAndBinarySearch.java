package ChallengeProblem;

import java.util.Arrays;

public class LinearAndBinarySearch {

    //Linear search for finding first missing positive
    public static void linearSearch(int array[]){
        Arrays.sort(array);
        for(int i=0;i<array.length;i++){

            if(array[i]!=i+1){
                System.out.println("The first missing positive is: "+(i+1));
                break;
            }

        }

    }
    //Binary search fo finding the target value
    public static void binarySearch(int array[],int key){
        int left=0;
        int right =array.length-1;
        int index=-1;

        while(left<=right){
            int mid = (left+right)/2;
            if(array[mid]==key){
                index =mid;
                break;
            }
            else if(array[mid]<key)left=mid+1;
            else right =mid-1;
        }
        System.out.println("The key is at index: "+index);
    }
}

