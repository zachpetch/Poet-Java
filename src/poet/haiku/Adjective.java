package poet.haiku;

class Adjective extends Word
{
    Adjective()
    {
        super();
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

    String getType()
    {
        return "adjective";
    }
}
