package codeclan.com.wordcounter;

/**
 * Created by user on 13/11/2017.
 */

public class WordCounter {



    public int count(String text){
        String[] words = text.split(" ");
        int length = words.length;
        return length;
    }

}
