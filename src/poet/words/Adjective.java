package poet.words;

public class Adjective extends Word
{
    public Adjective()
    {
        super();
        this.type = "adjective";
        assembleWords();
    }

    private void assembleWords()
    {
        addWord("cold");
        addWord("small");
        addWord("dumb");
        addWord("warm");
        addWord("fresh");
        addWord("sweet");
    }
}
