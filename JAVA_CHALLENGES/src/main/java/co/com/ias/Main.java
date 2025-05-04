package co.com.ias;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static co.com.ias.OddOneOut.findOdd;
import static co.com.ias.OddOneOut.findOdd2;

public class Main {
    public static void main(String[] args) throws IOException {

        List<String> arrayString = new ArrayList<>();
        arrayString.add("ACB");
        arrayString.add("BDC");
        arrayString.add("CED");
        arrayString.add("DEF");
        System.out.println(findOdd(arrayString));

        String[] arrayString2 = new String[arrayString.size()];
        arrayString2[0] = "ACB";
        arrayString2[1] = "BDC";
        arrayString2[2] = "CED";
        arrayString2[3] = "DEF";
        System.out.println(findOdd2(arrayString2));
    }
}