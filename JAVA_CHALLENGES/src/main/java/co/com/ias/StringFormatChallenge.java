package co.com.ias;

/*
Have the function StringChallenge(str) take the str parameter being passed, which will be a
string containing letters from the alphabet, and return a new string based on the following
rules:

1. Whenever a capital M is encountered, duplicate the previous character (then remove the M).

2. Whenever a capital N is encountered,
remove the next character from the string (then remove the N).

3. All other characters in the string will be lowercase letters.

Example:
input: "abcNdgM"
output: "abcgg"


input: "MrtyNNgMM"
Output: rtyggg
*/
public class StringFormatChallenge {

    public static String stringChallenge(String str) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            char c = str.charAt(i);

            if (c == 'M') {
                // Duplicar el carácter anterior si existe
                if (result.length() > 0) {
                    result.append(result.charAt(result.length() - 1));
                }
                i++; // Saltamos la 'M'
            } else if (c == 'N') {
                // Saltar el siguiente carácter también
                i += 2;
            } else {
                result.append(c);
                i++;
            }
        }

        return result.toString();
    }


}
