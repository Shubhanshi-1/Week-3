package LinearSearch.ListOfSentences;

public class ListOfSentances {
    public static String findWordInListOfSentences(String sentences[],String wordToSearch){
        //For each loop for iterations
        for(String sentence: sentences){
            String words[]= sentence.split("\\s+");//split by one or more spaces
            for(String w:words){
                if(w.equals(wordToSearch)){
                    return sentence;
                }
            }
        }
        //return not found when the word does not present in any sentence
        return "Not Found!!";
    }
}
