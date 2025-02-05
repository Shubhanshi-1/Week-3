package StringBuilder.RemoveDuplicates;

import java.util.HashSet;

public class RemoveDuplicate {
    public static void removeDuplicate(String word){
        //Create an empty StringBuilder
        StringBuilder sb= new StringBuilder();
      //Create an empty hashset
        HashSet<Character> hashSet = new HashSet<>();
        for(int i=0;i<word.length();i++){
            if(!hashSet.contains(word.charAt(i))){
                hashSet.add(word.charAt(i));
                sb.append(word.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
