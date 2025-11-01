package co.com.ias;

public class DiamondAsterisks {

    public void diamondPattern(int n) {

        // Upper part of the diamond
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Asterisks
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line
        }

        // Lower part of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Asterisks
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line
        }
    }
}
