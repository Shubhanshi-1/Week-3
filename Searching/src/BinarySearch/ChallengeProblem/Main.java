package BinarySearch.ChallengeProblem;

public class Main {
    public static void main(String args[]){
        int array[]= {2,1,5,4,6,9,8,7};
        int key= 5;
        //Method call
        LinearAndBinarySearch.linearSearch(array);
        LinearAndBinarySearch.binarySearch(array,key);
    }
}
