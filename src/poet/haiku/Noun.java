package poet.haiku;

class Noun extends Word
{
    Noun()
    {
        super();
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

    String getType()
    {
        return "noun";
    }
}
