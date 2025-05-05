package co.com.ias;

import java.util.ArrayList;

public class SortedAStringToListsIntoList {


//Write a function that converts input into output

//Input: "aaaabbbcca"
//Output: [("a",4),("b",3),("c",2),("a",1)]

    private static ArrayList sortedStringList(String string_input) {
        ArrayList outputList = new ArrayList();
        int counter = 1;
        String[] arrayLetters = string_input.split("");

        for(int index = 0; index < arrayLetters.length -1; index++) {
            String current = arrayLetters[index];
            String next = arrayLetters[index+1];
            if (!current.equals(next)) {
                Object[] intArray = {arrayLetters[index], counter};
                outputList.add(intArray);
                counter = 1;
            } else {
                counter += 1;
            }

        }
        Object[] intArray = { arrayLetters[arrayLetters.length - 1], counter };
        outputList.add(intArray);
        return outputList;

    }
}

