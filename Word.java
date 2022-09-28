import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.joining;

/**
 * A word consists of characters.
 * This class contains methods to create a list of characters and
 * to make a String with it.
 *
 * @author Myroslava
 * @version 1.0
 */

class Word implements SentenceItem {
    public ArrayList<Letter> letters;

    public Word() {
        this(new ArrayList<>());
    }

    public Word(List<Letter> letters) {
        this.letters = new ArrayList<>(letters);
    }

    @Override
    public String stringify() {
        return letters.stream().map(Letter::stringify).collect(joining(""));
    }
}