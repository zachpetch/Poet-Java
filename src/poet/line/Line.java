package poet.line;

import poet.words.*;

public class Line
{
    private int syllables;
    private String text = "";
    private Word noun;
    private Word verb;
    private Word adjective;
    private Word adverb;
    private Word article;
    private Word conjunction;
    private Word currentWord = new Word();

    public Line(int syllables)
    {
        // TODO: Split up word types to be much more granular (ex: adverbs -> conjunctive adverbs, etc.)
        this.syllables = syllables;
        this.noun = new Noun();
        this.verb = new Verb();
        this.adjective = new Adjective();
        this.adverb = new Adverb();
        this.article = new Article();
        this.conjunction = new Conjunction();
        generate();
    }

    private void generate()
    {
        // TODO: Account for multi-syllable words.
        for (int i = 0; i < this.syllables; i++) {
            Word word = getNextWord();
            this.text += word.getWord();
            if (i < this.syllables - 1) {
                this.text += " ";
            }
        }
    }

    private Word getNextWord()
    {
        switch (this.currentWord.getType()) {
            case "article":
                this.currentWord = this.adjective;
                break;
            case "adjective":
                this.currentWord = this.noun;
                break;
            case "noun":
                this.currentWord = this.verb;
                break;
            case "verb":
            case "conjunction":
                this.currentWord = this.adverb;
                break;
            case "adverb":
                this.currentWord = this.conjunction;
                break;
            default:
                this.currentWord = this.article;
        }

        return this.currentWord;
    }

    public String getLine()
    {
        return this.text;
    }
}
