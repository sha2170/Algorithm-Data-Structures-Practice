package 백준.덱;

import java.util.*;

public class Main_2346 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] moves = new int[N];

        for (int i=0; i<N; i++) {
            moves[i] = sc.nextInt();
        }

        // 터진 풍선 순서
        List<Integer> result = new ArrayList<>();
        boolean[] popped = new boolean[N];
        int index = 0; // 터뜨릴 풍선의 인덱스
        int count = N; // 남은 풍선 개수

        result.add(index+1);
        popped[index] = true;
        count--;

        while (count > 0) {
            int move = moves[index];
            if (move > 0) {
                for (int i=0; i<move; i++) {
                    index = (index + 1) % N;
                    while (popped[index]) {
                        index = (index + 1) % N;
                    }
                }
            } else {
                for (int i=0; i<Math.abs(move); i++) {
                    index = (index - 1 + N) % N;
                    while (popped[index]) {
                        index = (index - 1 + N) % N;
                    }
                }
            }

            result.add(index + 1);
            popped[index] = true;
            count--;
        }

        for (int num : result) {
            System.out.print(num + " ");
        }

    }
}