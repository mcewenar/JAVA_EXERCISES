package co.com.ias;

/*
You have an array (called myArray) with 10 elements (integers in the range of 1 to 9). Write a Java program that prints the number that has the longest consecutive occurrences in the array, and also prints how many times it appears in that sequence.

The code that initializes the array is already written, but you may edit it to test with other values. You can use the refresh button to restore the original values that will be used to evaluate your answer as correct or incorrect during execution.

Your program must analyze the array from left to right, so in case two numbers have the same longest consecutive sequence, the one that appears first from left to right should be printed.
For example, given the array:
(1, 2, 2, 5, 4, 6, 7, 8, 8, 8)
the output should be:
Longest: 3
Number: 8
In this example, the number 8 has the longest consecutive sequence (three eights in a row).
Make sure that your code prints the results exactly as shown so that the answer can be validated successfully.

The code to declare and populate myArray is already provided. You can modify it to test with different values, and you can press the refresh button to restore the original values that will be used for evaluation.

Note:
Assume that you are writing the code inside a class named Main, so you should not declare the class again. However, you must write the method public static void main to run your code.
java.util is already imported; you do not need to import this or any other library.
 */


public class LongestNumberIntoArrayChallenge {

    public void LongestNumberIntoArray() {

        int[] myArray = {1,2,2,2,4,5,6,7,8,8};
        int longest = 1;
        int currentLength = 1;
        int number = myArray[0];
        int currentNumber = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] == currentNumber) {
                currentLength++;
            } else {
                currentNumber = myArray[i];
                currentLength = 1;
            }

            if (currentLength > longest) {
                longest = currentLength;
                number = currentNumber;
            }
        }

        System.out.println("Longest: " + longest);
        System.out.println("Number: " + number);


    }


}
