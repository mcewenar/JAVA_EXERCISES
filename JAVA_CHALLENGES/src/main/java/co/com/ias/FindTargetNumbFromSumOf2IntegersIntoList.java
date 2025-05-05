package co.com.ias;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindTargetNumbFromSumOf2IntegersIntoList {
    //Given a list of integers and a target number,
    // it determines the indices of the two numbers that add up to the target.
    //list_input = [2,7,11,15,5,1,4]
    //Output: [1,6]

    public static int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        // Si no se encuentra una solución
        return new int[]{-1, -1};
    }

    /*public static int[] twoSumTwoPass(int[] nums, int target) {
        // Primer recorrido: guardar número → índice
        Map numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numToIndex.put(nums[i], i);
        }

        // Segundo recorrido: buscar el complemento
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement) && numToIndex.get(complement) != i) {
                return new int[]{i, (int) numToIndex.get(complement)};
            }
        }

        // Si no se encuentra una solución
        return new int[]{-1, -1};
    }

     */


}
