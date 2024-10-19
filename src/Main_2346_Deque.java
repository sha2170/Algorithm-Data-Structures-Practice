import java.util.*;

public class Main_2346_Deque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Deque<int[]> deque = new ArrayDeque<>();

        for (int i=0; i<N; i++) {
            deque.add(new int[]{i+1, sc.nextInt()});
        }

        List<Integer> result = new ArrayList<>();

        int[] current = deque.pollFirst();
        result.add(current[0]);
        int move = current[1];

        while (!deque.isEmpty()) {
            if (move > 0) {
                for (int i=0; i<move-1; i++) {
                    deque.addLast(deque.pollFirst());
                }
                current = deque.pollFirst();
            } else {
                for (int i=0; i<Math.abs(move) - 1; i++) {
                    deque.addFirst(deque.pollLast());
                }
                current = deque.pollLast();
            }

            result.add(current[0]);
            move = current[1];
        }

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
