import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class WordValidatorTest {
    @Test
    public void testIsWordWithValidWord() {

        assertTrue(WordValidator.isWord("Pelle"));
    }

    @Test
    public void testIsWordWithEmptyString() {

        assertFalse(WordValidator.isWord(""));
    }

    @Test
    public void testIsWordWithNonLetterCharacters() {
        assertFalse(WordValidator.isWord("Pe1e"));
    }

    @Test
    public void testIsWordWithValidVowelConsonantRatio() {

        assertTrue(WordValidator.isWord("Banana"));
    }
    @Test
    public void testIsWordWithInvalidVowelConsonantRatio() {

        assertTrue(WordValidator.isWord("eye"));
    }


}