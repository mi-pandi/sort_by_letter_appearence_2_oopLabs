import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.joining;

/**
 * A sentence consists of items that can be either letters/numbers or punctuation symbols
 * This class contains methods to create a list of items and
 * to make a String with it.
 *
 * @author Myroslava
 * @version 1.0
 */
class Sentence {
    public ArrayList<SentenceItem> items;

    public Sentence() {
        this(new ArrayList<>()); //вызывает второй конструктор
    }

    public Sentence(List<SentenceItem> items) {
        this.items = new ArrayList<>(items);
    }

    public String stringify() {
        return items.stream().map(SentenceItem::stringify).collect(joining(""));
    }
}