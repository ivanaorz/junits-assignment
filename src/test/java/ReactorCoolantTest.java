import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ReactorCoolantTest {
    @Test
    public void testWaterBoilingAt100Celsius() {
        assertTrue(ReactorCoolant.isWaterBoiling(100));
    }

    @Test
    public void testWaterNotBoilingAt20Celsius() {
        assertFalse(ReactorCoolant.isWaterBoiling(20));
    }

    @Test
    public void testWaterNotBoilingBelowAbsoluteZero() {
        assertThrows(IllegalArgumentException.class, () -> ReactorCoolant.isWaterBoiling(-273.16f));
    }

}