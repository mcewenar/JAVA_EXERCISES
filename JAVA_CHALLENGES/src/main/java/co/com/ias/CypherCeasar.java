package co.com.ias;

/*
✅ INTERVIEW QUESTION (Created Based on Your Code Challenge)
Decryption Challenge — Find the Original Text Using a Known Word

You are given two inputs:

cipherText — a string encrypted using a Caesar cipher.
The cipher shifts letters forward in the English alphabet.
For example, with a shift of +2:

“a” → “c”

“x” → “z”

“z” → “b” (wrap-around)

knownWord — a word that you know appears somewhere in the original, unencrypted text.

Your task is to write a function:

public static String decipher(String cipherText, String knownWord)


that recovers the original message.

Rules / Requirements

You must determine the correct Caesar shift by finding the shift that makes the knownWord appear in the decrypted text.

The encryption preserves letter case (uppercase stays uppercase, lowercase stays lowercase).

Non-alphabetic characters must NOT be changed (spaces, punctuation, digits, etc.).

If none of the 26 possible shifts produce a plaintext containing the known word, return:

"invalid"

Example

Input:

cipherText:

Eqfkpi vqwv ctq hwpf!


knownWord:

tests


Output:

Coding tests are fun!

✅ SIMPLE, CLEAR EXPLANATION (EASY TO UNDERSTAND)

A Caesar cipher shifts letters like this:

Original: a b c d ... x y z
Shift +2: c d e f ... z a b


To decrypt, we must reverse the shift:

Decrypted = Encrypted - shift


But we don’t know the shift.

So we:

Try every shift from 0 to 25

Decrypt the entire text with that shift

Check if the decrypted text contains knownWord

If yes → return that decrypted text

If no shift works → return "invalid"

This is called brute-force Caesar cipher decoding.


 */



public class CypherCeasar {
    public static String decipher(String cipherText, String knownWord) {

        // Try all 26 possible Caesar shifts
        for (int shift = 0; shift < 26; shift++) {
            StringBuilder result = new StringBuilder();

            for (char c : cipherText.toCharArray()) {
                if (Character.isLetter(c)) {
                    char base = Character.isUpperCase(c) ? 'A' : 'a';

                    // reverse the encryption: subtract the shift
                    int decoded = (c - base - shift + 26) % 26;

                    result.append((char) (base + decoded));
                } else {
                    // keep spaces, punctuation, digits, etc.
                    result.append(c);
                }
            }

            String plaintext = result.toString();

            // If the known word appears, this is the correct shift
            if (plaintext.contains(knownWord)) {
                return plaintext;
            }
        }

        // No shift produced a valid message
        return "invalid";
    }


}
