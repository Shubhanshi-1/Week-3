package LinearSearch.FirstNegativeNumber;

public class FirstNegativeNumber {
    public static void findFirstNegativeNumber(int array[]){
        //Initialize index as -1
        int index= -1;
       for(int i=0;i<array.length;i++){
           if(array[i]<0) {
               //update the index value when negative number is found
               index=i;
               break;
           }
       }
       //Print the index in which the first negative number is found
       System.out.println(index);
    }
}
