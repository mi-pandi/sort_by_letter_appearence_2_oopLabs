/**
 * Checks whether the Symbol is recognized as a punct
 *
 * @author Myroslava
 * @version 1.0
 */

enum Punct implements SentenceItem {
    DOT('.'),
    COMMA(','),
    SPACE(' ');

    public static Punct fromSymbol(char c) {
        for (Punct p : Punct.values()) {
            if (p.symbol == c)
                return p;
        }
        return null;
    }

    public final char symbol;

    Punct(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String stringify() {
        return String.valueOf(symbol);
    }
}