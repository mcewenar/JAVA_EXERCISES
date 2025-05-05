package co.com.ias;

public class Exercise4 {
    //Read three numbers and print the greater
    public static void printGreaterNumber(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("Greater Number: " + max);
    }
}
