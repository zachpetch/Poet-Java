package poet.words;

public class Adverb extends Word
{
    public Adverb()
    {
        super();
        this.type = "adverb";
        assembleWords();
    }

    private void assembleWords()
    {
        addWord("fast");
        addWord("hard");
        addWord("soft");
        addWord("cold");
        addWord("back");
        addWord("loud");
        addWord("slow");
        addWord("hot");
    }
}
