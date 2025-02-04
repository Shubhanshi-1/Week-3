package BinarySearch.FirstAndLastOccurence;

public class Main {
    public static void main(String args[]){
        int array[]={2,3,3,3,4,5,6};
        int target =3;
        //Stroign the values
        int firstOccurrence=FirstAndLastOccurrences.findFirstOccurrence(array,target);
        int lastOccurrence =FirstAndLastOccurrences.findLastOccurrences(array,target);

        //Print the output
        if (firstOccurrence == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("First Occurrence of " + target + ": " + firstOccurrence);
            System.out.println("Last Occurrence of " + target + ": " + lastOccurrence);
        }
    }
}
