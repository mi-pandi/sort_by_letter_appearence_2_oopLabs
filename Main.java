import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A main class contains a test for the code and
 * a method for counting letter appearance that could be used for sorting.
 *
 * @author Myroslava
 * @version 1.0
 */

public class Main {
    private static final String TEXT = "Merhhhaba levie mane amat, miskhhandura adhlitein klemit. Mianur, hherit  erat vohluthpath.";
    private static final char LETTER = 'h';

    private static long charCount(Word w) {
        return w.letters.stream().filter(c -> c.letter == Main.LETTER).count();
    }

    public static void main(String[] args) {
        Text text = Text.parse(TEXT);
        System.out.println(text.stringify());

        List<String> words = text.sentences.stream()
                .flatMap(sentence -> sentence.items.stream())
                .filter(item -> item instanceof Word)
                .map(item -> (Word) item)
                .sorted(Comparator.comparingLong(Main::charCount))
                .map(Word::stringify)
                .collect(Collectors.toList());
        System.out.println(words);
    }
}
