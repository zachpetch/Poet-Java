package poet.haiku;

class Verb extends Word
{
    Verb()
    {
        super();
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

    String getType()
    {
        return "verb";
    }
}
