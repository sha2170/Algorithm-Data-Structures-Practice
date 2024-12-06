package 백준.정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] count = new int[10001];

        for (int i=0; i<N; i++) {
            int number = Integer.parseInt(br.readLine());
            count[number]++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i=1; i<=10000; i++) {
            while (count[i] > 0) {
                sb.append(i).append("\n");
                count[i]--;
            }
        }

        System.out.println(sb.toString());
    }
}
