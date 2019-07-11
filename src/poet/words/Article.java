package poet.words;

public class Article extends Word
{
    public Article()
    {
        super();
        this.type = "article";
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
}

