package BinarySearch.SortedMatrix;

public class Main {
    public static void main(String args[]){
        int rows= 4;
        int coloum =4;
        //2d array
        int array[][] ={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        //providing target value
        int targetValue=11;

       Boolean result = TargetValue.findTargetValue(array,targetValue,rows,coloum);
       //Print the result
       if(result==true)System.out.println("Target value found");
       else System.out.println("Value not found");

    }
}
