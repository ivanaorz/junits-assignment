public class DataStore {
    private static Object storedValue = null;

    public static void store(Object value) {
        storedValue = value;
    }

    public static Object retrieve() {
        return storedValue;
    }
}
