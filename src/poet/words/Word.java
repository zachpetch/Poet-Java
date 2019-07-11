package poet.words;

import java.util.ArrayList;
import java.util.Random;

public class Word
{
    /*
     * TODO List:
     *
     */
    private ArrayList<String> words = new ArrayList<>();
    String type = "word";

    void addWord(String text)
    {
        words.add(text);
    }

    public String getWord()
    {
        Random r = new Random();
        return words.get(r.nextInt(words.size()));
    }

    public String getType()
    {
        return this.type;
    }
}
