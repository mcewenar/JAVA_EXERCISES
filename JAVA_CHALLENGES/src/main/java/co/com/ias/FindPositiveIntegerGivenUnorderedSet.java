package co.com.ias;

public class FindPositiveIntegerGivenUnorderedSet {
/*
Given a disordered set with Integer numbers,
find the first positive integer (upper than 0), missing from the secuence
input1 = [3,4,-1,1]
#Output: 2

input2 = [1,2,0]
#Output: 3

input3 = [3,4,-1,1,2,7,10]
#Output: 5


 */

    public static int findFirstMissingPositive(int[] nums) {
        int n = nums.length;

        // Reorganizar los números en sus posiciones correctas
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Intercambiar nums[i] con nums[nums[i] - 1]
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        // Identificar el primer número positivo faltante
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // Si todos los números están en su lugar, el faltante es n + 1
        return n + 1;
    }
}
