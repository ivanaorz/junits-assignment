public class ReactorCoolant {
    public static boolean isWaterBoiling(float degreesCelsius) {
        if (degreesCelsius < 0) {
            throw new IllegalArgumentException("Temperature cannot be below absolute zero.");
        }
        // Water boils at 100 degrees Celsius at standard atmospheric pressure
        return degreesCelsius >= 100;
    }
}
