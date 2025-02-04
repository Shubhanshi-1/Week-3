package BinarySearch.PeakElementInArray;

public class PeakElement {
    //Function to find peak element
    public static void findPeakElement(int array[]){
        //Declare a peak variable to store peak value
        int peak=0;
        int left=0;
        int right=array.length-1;
        //Iterate till left is smaller than right
        while(left<right){
            int mid= (left+right)/2;
            if(array[mid]>array[mid-1]&& array[mid]>array[mid+1]) {
                peak=array[mid];
                break;
            }
            else if(array[mid]<array[mid-1]) right=mid-1;
            else left=mid+1;

        }
        //Print the peak value
        System.out.println("The peak value is: "+peak);
    }
}
