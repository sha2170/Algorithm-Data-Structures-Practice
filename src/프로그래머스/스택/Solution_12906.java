package 프로그래머스.스택;

import java.util.*;

public class Solution_12906 {
    public int[] solution(int[] arr) {

        List<Integer> resultList = new ArrayList<>();

        resultList.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[i - 1]) {
                resultList.add(arr[i]);
            }
        }


        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }


    public static void main(String[] args) {
        Solution_12906 solution = new Solution_12906();

        // 예시 배열 테스트
        int[] arr1 = {1, 1, 3, 3, 0, 1, 1};
        int[] arr2 = {4, 4, 4, 3, 3};

        System.out.println("Test case 1: " + Arrays.toString(solution.solution(arr1))); // [1, 3, 0, 1]
        System.out.println("Test case 2: " + Arrays.toString(solution.solution(arr2))); // [4, 3]
    }
}
