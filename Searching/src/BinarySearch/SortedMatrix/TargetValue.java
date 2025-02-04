package BinarySearch.SortedMatrix;

public class TargetValue {
    public static boolean findTargetValue(int array[][],int targetValue,int rows,int coloum){
       int left=0;
       int right = (rows*coloum)-1;

       //Iterate to get the target value
       while(left<right){
           int mid= (left+right)/2;
           if(targetValue==mid) return true;
           else if(targetValue<mid) right= mid-1;
           else left=mid+1;
       }
       return false;
    }
}
