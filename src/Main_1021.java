import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class Main_1021 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] targets = new int[M];
        for (int i=0; i<M; i++) {
            targets[i] = sc.nextInt();
        }

        Deque<Integer> deque = new LinkedList<>();

        for (int i=1; i<=N; i++) {
            deque.offer(i);
        }

        int totalMoves = 0; // 이동 횟수

        for (int target : targets) {
            int index = 0;

            for (int num : deque) {
                if (num == target) {
                    break;
                }
                index++;
            }

            if (index <= deque.size() / 2) {
                for (int i=0; i<index; i++) {
                    deque.offerLast(deque.pollFirst());
                    totalMoves++;
                }
            } else {
                for (int i=0; i<deque.size() - index; i++) {
                    deque.offerFirst(deque.pollLast());
                    totalMoves++;
                }
            }
            deque.pollFirst();
        }

        System.out.println(totalMoves);
    }
}
