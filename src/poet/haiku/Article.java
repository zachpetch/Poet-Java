package poet.haiku;

class Article extends Word
{
    Article()
    {
        super();
        assembleWords();
    }

    private void assembleWords()
    {
        addWord("the");
        addWord("my");
        addWord("our");
        addWord("your");
        addWord("his");
        addWord("her");
    }

    String getType()
    {
        return "article";
    }
}

