package StringBuilder.ReverseString;

public class ReverseString {
    //Method to reverse a String
    public static String reverseString(String word){
        //Create a StringBuilder
        StringBuilder sb= new StringBuilder();
        //add the word in sb
        sb.append(word);
        //reverse the String
        sb.reverse();
        // Store the reverse string in newString
        String newString =sb.toString();
        return newString;
    }
}
