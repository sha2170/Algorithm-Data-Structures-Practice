package 프로그래머스.정렬;

import java.util.Arrays;

public class Solution_42746 {
    public String Main_42746(int[] numbers) {
        String[] Numbers = new String[numbers.length];
        for (int i=0; i<numbers.length; i++) {
            Numbers[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(Numbers, (a, b) -> (b + a).compareTo(a + b));

        if (Numbers[0].equals("0")) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for (String number : Numbers) {
            result.append(number);
        }

        return result.toString();
    }

}