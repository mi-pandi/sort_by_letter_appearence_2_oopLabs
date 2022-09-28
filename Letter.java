/**
 * Contains all possible characters that may be used in a word and
 * checks whether the input is an object of this class (constructor)
 *
 * @author Myroslava
 * @version 1.0
 */
class Letter {
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz0123456789";
    private static final String ALPHABET = LOWER + LOWER.toUpperCase();

    public char letter;

    public Letter(char letter) {
        if (!ALPHABET.contains(String.valueOf(letter)))
            throw new InvalidLetter(letter);

        this.letter = letter;
    }

    public String stringify() {
        return String.valueOf(letter);
    }
}