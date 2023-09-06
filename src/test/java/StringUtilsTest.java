import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StringUtilsTest {
    @Test
    public void testTrimWithSpaces() {
        assertEquals("Hello, World!", StringUtils.trim("   Hello, World!   "));
    }

    @Test
    public void testTrimWithTabs() {
        assertEquals("TabTest", StringUtils.trim("\t\tTabTest\t\t"));
    }

    @Test
    public void testTrimWithNewlines() {
        assertEquals("NewlineTest", StringUtils.trim("\n\nNewlineTest\n\n"));
    }

    @Test
    public void testTrimMixedWhitespace() {
        assertEquals("MixedWhitespace", StringUtils.trim("\t  MixedWhitespace\n\n"));
    }

    @Test
    public void testTrimEmptyString() {
        assertEquals("", StringUtils.trim(""));
    }
    @Test
    public void testTrimNullInput() {
        assertNull(StringUtils.trim(null));
    }

}