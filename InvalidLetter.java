/**
 * Exception caused by invalid character
 *
 * @author Myroslava
 * @version 1.0
 */
class InvalidLetter extends RuntimeException {
    public InvalidLetter(char letter) {
        super(String.format("invalid letter '%s'", letter));
    }
}