package LinearSearch.ListOfSentences;

public class Main {
    public static void main(String args[]){
        //Provide list of sentences in a String Array
        String[] sentences ={"The sky is blue. ",
                          "The grass is green.",
                         "The flower is pink." };
        //Provide a word to search
        String wordToSearch = "flower";
        //Storing the sentence in result variable
        String result = ListOfSentances.findWordInListOfSentences(sentences,wordToSearch);
        //Print the result to the console
        System.out.println(result);
    }
}
