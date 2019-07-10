package poet.haiku;

class Adverb extends Word
{
    Adverb()
    {
        super();
        assembleWords();
    }

    private void assembleWords()
    {
        addWord("fast");
        addWord("hard");
        addWord("off");
        addWord("back");
    }

    String getType()
    {
        return "adverb";
    }
}
