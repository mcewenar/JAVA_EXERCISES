package co.com.ias;


/*
* take the str parameter being passed and return it in proper snake case format where each word is lowercased and separated from adjacent
* words via an underscore. The string will only contain letters and some combination of delimiter punctuation characters separating each word.
*
* Input: BOB loves-coding
* Output: bob_loves_coding.
*
* Input: cats AND*dogs-are Awesome
* Output: cats_and_dogs_are_awesome
*
* */
public class SnakeCaseChallenge {

    public static String toSnakeCase(String str) {
        // Replace all non-letter characters with spaces
        String cleaned = str.replaceAll("[^A-Za-z]", " ");

        // Split by whitespace
        String[] words = cleaned.trim().split("\\s+");

        // Build the snake case result
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            result.append(words[i].toLowerCase());
            if (i < words.length - 1) {
                result.append("_");
            }
        }
        return result.toString();
    }
}
