package poet.haiku;

import java.util.ArrayList;
import java.util.Random;

class Word
{
    private ArrayList<String> words = new ArrayList<>();

    void addWord(String text)
    {
        words.add(text);
    }

    String getWord()
    {
        Random r = new Random();
        return words.get(r.nextInt(words.size()));
    }

    String getType()
    {
        return "word";
    }
}
