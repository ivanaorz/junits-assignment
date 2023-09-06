import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConvertTest {
    @Test
    public void testConvertFahrenheitToCelsius() {
//        Convert convert = new Convert(); If the method is static there is no need to create an instance of the class
        double actualValue = Convert.convertFahrenheitToCelsius(32);
        assertEquals(0, actualValue, 0.01);
    }

    @Test
    public void testConvert67FahrenheitToCelsius() {
        double actualValue = Convert.convertFahrenheitToCelsius(67);
        assertEquals(19.44, actualValue, 0.01);
    }

    @Test
    public void testConvert100FahrenheitToCelsius() {
        double actualValue = Convert.convertFahrenheitToCelsius(100);
        assertEquals(37.78, actualValue, 0.01);
    }

    @Test
    public void testConvert220FahrenheitToCelsius() {
        double actualValue = Convert.convertFahrenheitToCelsius(220);
        assertEquals(104.44, actualValue, 0.01);
    }
}