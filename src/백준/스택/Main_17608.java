package 백준.스택;

import java.util.Scanner;

public class Main_17608 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] heights = new int[N];

        for (int i=0; i<N; i++) {
            heights[i] = sc.nextInt();
        }

        int visibleCount = 0;
        int maxHeight = 0;

        for (int i=N-1; i>=0; i--) {
            if (heights[i] > maxHeight) {
                visibleCount++;
                maxHeight = heights[i];
            }
        }

        System.out.println(visibleCount);
        sc.close();
    }
}