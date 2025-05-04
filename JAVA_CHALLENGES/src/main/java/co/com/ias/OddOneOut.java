package co.com.ias;
/*
Analyze the difference in adjacent letters of the alphabet given a string. Given an input sequence of words, find the 'Odd One Out'
by checking the difference between adjacent letters. The element having a distinct difference is the 'Odd One Out.'

series = ["ACB", "BDC", "CED", "DEF."]

Complete the function findOdd in the editor.
findOdd has the following parameter(s):
string series[n]: an array of strings

Constraints
3≤𝑛≤26
2≤length of series[i]≤26
All strings are uppercase English letters only.
Within a test case, all strings are of equal length.


series = ["ACB", "BDC", "CED", "DEF."]


*/

import java.util.*;


public class OddOneOut {
    //IA WAY
    public static String findOdd(List<String> series) {
        // map each pattern to its frequency
        Map<List<Integer>, Integer> freq = new HashMap<>();
        // keep the patterns in order so we can map back to words
        List<List<Integer>> patterns = new ArrayList<>();

        // 1) build the diff-pattern for each word and count them
        for (String w : series) {
            List<Integer> diffs = new ArrayList<>();
            for (int i = 0; i + 1 < w.length(); i++) {
                //Código ASCII
                diffs.add(w.charAt(i + 1) - w.charAt(i));
            }
            patterns.add(diffs);
            freq.put(diffs, freq.getOrDefault(diffs, 0) + 1);
        }

        // 2) find the one whose pattern count is 1
        for (int i = 0; i < series.size(); i++) {
            if (freq.get(patterns.get(i)) == 1) {
                return series.get(i);
            }
        }
        // per problem constraints this should never happen
        return "";
    }

    /**
     * Encuentra la cadena cuyo patrón de diferencias entre letras adyacentes
     * es único dentro del array.
     */
    public static String findOdd2(String[] series) {
        var pattern = new HashMap<String, List<String>>();
        for (String s : series) {
            int size = s.length();
            char[] cs = new char[size];
            for (int i = 0; i < size - 1; ++i) {
                cs[i] = (char) (s.charAt(i + 1) - s.charAt(i));
            }
            String castCharToString = String.valueOf(cs);
            pattern.putIfAbsent(castCharToString, new ArrayList<>());
            pattern.get(castCharToString).add(s);
        }
        for (var ss : pattern.values()) {
            if (ss.size() == 1) {
                return ss.get(0);
            }
        }
        return "";
    }

}







