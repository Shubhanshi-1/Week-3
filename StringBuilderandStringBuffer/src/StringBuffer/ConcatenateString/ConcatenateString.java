package StringBuffer.ConcatenateString;

public class ConcatenateString {
    public static void stringConcatenation(String[] array){
        //Create an empty StringBuffer
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<array.length;i++) {
            sb.append(array[i]); //Concatenating the string
        }
        //Print the Concatenated String
        System.out.println(sb);
    }
}
