package co.com.ias;

import java.io.IOException;

/*Question 1
Write a method that takes 2 parameters. The first parameter is an array of integers that has already been sorted from smallest to largest.  The second parameter is an integer. The method should return the number of times the second parameter appears in the first parameter.

Example:
If the first parameter is [1, 2, 3, 3, 4, 5] and the second parameter is 3. The method should return 2.

Part 1: Please explain your algorithm.

Part 2: Please implement the method in Java.


 */
public class Marso_technologies1 {


    public static int countNumberTimes(int[] sortedArray, int target) {

            //First, we init a counter which will provide numeber of ocurrences.
            int counter = 0;
            //Out approach is using a O(n) complexity, where depending on how long is the array, the time in complexing its task
            //will be proportional.
            for(int i = 0; i < sortedArray.length; i++) {
                //Simply we compare every element from the array with target parameter.
                if(sortedArray[i] == target) {
                    //Sum +1 each time that there is a occurrence.
                    counter++;
                }
            }
        //Finally, we return the target's occurrences number
        return counter;

    }
    public static void main(String[] args) throws IOException {
            //Prove us calling the method as a static:
            int[] array = {1,2,3,3,4,5};
            int result = countNumberTimes(array, 3);
            System.out.println("Result: " + result); // Expected: 2

    }



}
