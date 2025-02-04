package BinarySearch.RotatedSortedArray;

public class RotatedSortedArray {
    public static void findIndexOfSmallestElement(int array[]) {
        //Initialize left by 0
        int left = 0;
        //Initialize right by length of array-1.
        int right = array.length - 1;

        //Iterate till left and right become equal
        while(left<right){
            int mid= (left+right)/2;
            if(array[mid]>array[right]) left=mid+1;
            else right=mid;
        }
        //Print the index of smallest element
        System.out.println("Index of smallest element: "+left);
    }
}
