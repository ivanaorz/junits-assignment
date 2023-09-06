import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TextUtilsTest {
    @Test
    public void testCapitalizePelle() {
        assertEquals("Pelle", TextUtils.capitalize("pelle")); // Capitalize first character
    }
    @Test
    public void testCapitalizeApple() {
        assertEquals("Apple", TextUtils.capitalize("apple")); // Capitalize first character
    }
    @Test
    public void testCapitalize123abc() {
        assertEquals("123abc", TextUtils.capitalize("123abc")); // No change to digits
    }
    @Test
    public void testCapitalizeEmptyString() {
        assertEquals("", TextUtils.capitalize("")); // Empty string remains empty
    }
    @Test
    public void testCapitalizeNullInput() {
        assertNull(TextUtils.capitalize(null)); // Null input should return null
    }

}