import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DrivingTest {
    @Test
    public void testIsAllowedToDrive() {
        int age = 18;
        boolean actualResult = Driving.isAllowedToDrive(age);
        boolean expectedResult = true;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsAllowedToDriveAt8() {
        int age = 8;
        boolean actualResult = Driving.isAllowedToDrive(age);
        boolean expectedResult = false;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsAllowedToDriveAt42() {
        int age = 42;
        boolean actualResult = Driving.isAllowedToDrive(age);
        boolean expectedResult = true;
        assertEquals(expectedResult, actualResult);
    }


}