package co.com.ias;

public class Exercise8 {
    //Count how many positive, negative, and zero numbers there are among 10 entered numbers
    public static String countNumbersTypes(Integer[] integers) {
        int zeroCounter = 0;
        int positiveCounter = 0;
        int negativeCounter = 0;
        for (int i = 0; i<integers.length; i++){
            if (integers[i] == null) continue;
            if (integers[i]==0){
                zeroCounter++;
            } else if(integers[i]>0){
                positiveCounter++;
            } else {
                negativeCounter++;

            }

        }
        return "Zero = " + zeroCounter +
                ", Positive = " + positiveCounter +
                ", Negative = " + negativeCounter;

    }
}
