package poet.words;

public class Verb extends Word
{
    public Verb()
    {
        super();
        this.type = "verb";
        assembleWords();
    }

    private void assembleWords()
    {
        addWord("ran");
        addWord("sailed");
        addWord("jumped");
        addWord("screamed");
        addWord("flew");
        addWord("kicked");
    }
}
