package co.com.ias;

import java.util.ArrayList;
import java.util.List;

/*
determine if a number is happy, which is a number whose sum of the square of the digits eventually converges to 1. Return
true if it's a Happy number, otherwise return false.

For example: 10 is happy because 1elevate 2 + 0 elevate 2 converges to 1.

Input: 1
output: true

Input: 101
output: false
*/
public class HappyNumberMathChallenge {

    public static boolean mathChallenge(int num) {
        // Decompose the number using resto
        List<Integer> saveNum = new ArrayList<>();
        while(num > 0) {
            int digit = num % 10;
            saveNum.add(digit);
            num = num / 10;
        }

        int sum = 0;
        for (int j = 0; j <= saveNum.size() - 1; j++) {
            sum += Math.pow(saveNum.get(j), 2);
        }
        System.out.println(sum);
        return sum == 1 ? true : false;
    }

}
