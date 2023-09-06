public class StringUtils {
    public static String trim(String input) {
        if (input == null) {
            return null;
        }

        int startIndex = 0;
        int endIndex = input.length() - 1;

        // Find the index of the first non-whitespace character from the start
        while (startIndex <= endIndex && (input.charAt(startIndex) == ' ' || input.charAt(startIndex) == '\t' || input.charAt(startIndex) == '\n')) {
            startIndex++;
        }

        // Find the index of the first non-whitespace character from the end
        while (endIndex >= startIndex && (input.charAt(endIndex) == ' ' || input.charAt(endIndex) == '\t' || input.charAt(endIndex) == '\n')) {
            endIndex--;
        }

        // Extract the trimmed substring
        if (startIndex <= endIndex) {
            return input.substring(startIndex, endIndex + 1);
        } else {
            return "";
        }

        }
}
