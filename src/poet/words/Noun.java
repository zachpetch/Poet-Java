package poet.words;

public class Noun extends Word
{
    public Noun()
    {
        super();
        this.type = "noun";
        assembleWords();
    }

    private void assembleWords()
    {
        addWord("ant");
        addWord("ball");
        addWord("cat");
        addWord("dog");
        addWord("egg");
        addWord("flute");
    }
}
