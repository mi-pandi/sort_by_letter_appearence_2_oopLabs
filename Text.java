import java.util.ArrayList;

import static java.util.stream.Collectors.joining;

/**
 * A text consists of sentences.
 * This class contains methods for parsing an input text and add it to the multidimensional array and
 * to make a String with it.
 *
 * @author Myroslava
 * @version 1.0
 */

class Text {
    public ArrayList<Sentence> sentences;

    public static Text parse(String s) {
        Text text = new Text();

        Sentence sent = new Sentence();
        text.sentences.add(sent); //create an array inside the array to get a multidimensional array

        Word word = null;

        for (char c : s.toCharArray()) {
            Punct p = Punct.fromSymbol(c); //first checks whether the char is a punctuation mark
            if (p != null) {
                word = null;
                sent.items.add(p);//adds punc
                if (p.symbol == '.') { //a point means a start of new sentence, so we create a new array inside a text one
                    sent = new Sentence();
                    text.sentences.add(sent);
                }
            } else {
                if (word == null) {//it equals null at the beginning or after some punctuation, so it means a new word
                    word = new Word();
                    sent.items.add(word); //adding a word in a sentence (array inside array)
                }
                word.letters.add(new Letter(c)); //just adds a letter to a word
            }
        }
        return text;
    }

    public Text() {
        this.sentences = new ArrayList<>();
    }

    public String stringify() {
        return sentences.stream().map(Sentence::stringify).collect(joining(""));
    }
}