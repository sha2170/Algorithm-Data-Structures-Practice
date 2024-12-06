package 백준.정렬;

import java.util.HashMap;
import java.util.Scanner;

public class Main_10816 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<Integer, Integer> cardCount = new HashMap<>();

        for (int i=0; i<N; i++) {
            int num = sc.nextInt();
            // 해당 숫자가 이미 HashMap에 있으면 카운트 증가, 없으면 새로 추가
            cardCount.put(num, cardCount.getOrDefault(num, 0) + 1);
        }

        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<M; i++) {
            int numCount = sc.nextInt();
            sb.append(cardCount.getOrDefault(numCount, 0)).append(" ");
        }

        System.out.println(sb.toString().trim());

        sc.close();
    }

}
