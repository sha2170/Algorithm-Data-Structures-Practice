package 프로그래머스.정렬;

import java.util.Arrays;

class Solution_42747 {
    public int main_42747(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;

        for (int i = 0; i < n; i++) {
            int h = n - i;
            if (citations[i] >= h) {
                return h;
            }
        }

        return 0;
    }
}
