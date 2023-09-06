public class WordValidator {
    public static boolean isWord(String maybeWord) {
        // Check if the parameter is a string
        if (maybeWord == null || !maybeWord.matches("[a-zA-Z]+")) {
            return false;
        }

        // Check if the string is not empty
        // Initialize counters for vowels and consonants
        int vowelCount = 0;
        int consonantCount = 0;
        String vowels = "AEIOUaeiou"; // Include both uppercase and lowercase vowels

        // Iterate through the characters of the input string
        for (char c : maybeWord.toCharArray()) {
            if (vowels.contains(String.valueOf(c))) {
                // Increment the vowel count
                vowelCount++;
            } else {
                // Increment the consonant count
                consonantCount++;

                // Check if the vowel-consonant ratio is violated
                if (vowelCount > consonantCount * 2) {
                    return false;
                }
            }
        }
        // Check the final vowel-consonant ratio
        return vowelCount >= consonantCount;
    }

    }
