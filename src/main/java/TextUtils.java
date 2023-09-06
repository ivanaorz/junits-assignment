public class TextUtils {
    public static String capitalize(String text) {
        if (text == null || text.isEmpty()) {
            return text; // Return unchanged if null or empty
        }

        // Capitalize the first character and concatenate the rest of the string
        return Character.toUpperCase(text.charAt(0)) + text.substring(1);
    }
}
