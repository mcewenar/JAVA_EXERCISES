package co.com.ias;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import static co.com.ias.Exercise10.menuOperation;
import static co.com.ias.Exercise7.tableMultiply;
import static co.com.ias.Exercise8.countNumbersTypes;
import static co.com.ias.Exercise9.validateLeapYear;
import static co.com.ias.OddOneOut.findOdd;
import static co.com.ias.OddOneOut.findOdd2;

public class Main {
    public static void main(String[] args) throws IOException {

        List<String> arrayString = new ArrayList<>();
        arrayString.add("ACB");
        arrayString.add("BDC");
        arrayString.add("CED");
        arrayString.add("DEF");
        //System.out.println(findOdd(arrayString));

        String[] arrayString2 = new String[arrayString.size()];
        arrayString2[0] = "ACB";
        arrayString2[1] = "BDC";
        arrayString2[2] = "CED";
        arrayString2[3] = "DEF";
        //System.out.println(findOdd2(arrayString2));


        //tableMultiply(4)
        Integer[] arrayString3 = new Integer[10];
        arrayString3[0] = -5;
        arrayString3[1] = -4;
        arrayString3[2] = -7;
        arrayString3[3] = 0;
        arrayString3[4] = 0;
        arrayString3[5] = 0;
        arrayString3[6] = 0;
        arrayString3[7] = 9;
        arrayString3[8] = 8;
        arrayString3[9] = 10;
        //System.out.println(countNumbersTypes(arrayString3));

        //validateLeapYear(2012);

        System.out.println(menuOperation());

    }
}