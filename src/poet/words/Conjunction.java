package poet.words;

public class Conjunction extends Word
{
    public Conjunction()
    {
        super();
        this.type = "conjunction";
        assembleWords();
    }

    private void assembleWords()
    {
        addWord("and");
        addWord("but");
        addWord("yet");
    }
}
