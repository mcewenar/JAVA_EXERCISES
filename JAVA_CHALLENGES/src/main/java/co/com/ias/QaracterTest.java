package co.com.ias;

import java.util.HashSet;
import java.util.Set;

public class QaracterTest {

    public int solution(int[] A) {

        int notOccur = -1;
        int n = A.length;
        Set<Integer> setPositive = new HashSet<>();

        for (int k : A) {
            if (k > 0) {
                setPositive.add(k);
            }
        }

        //we need to find the first positive integer
        for(int j = 0; j <= n + 1; j++ ) {
            if(!setPositive.contains(j)) {
                notOccur = j;
            }

        }
        //System.out.printf("HOLA HOLA qaracter" +setPositive);
        return notOccur;



    }
}
