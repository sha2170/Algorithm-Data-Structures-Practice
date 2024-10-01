import java.util.*;

public class Main_11725 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer>[] tree = new ArrayList[N+1];
        int[] parents = new int[N+1];

        for (int i=1; i<=N; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i=0; i<N-1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            tree[a].add(b);
            tree[b].add(a);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        parents[1] = 1;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int next : tree[current]) {
                if (parents[next] == 0) {
                    parents[next] = current;
                    queue.add(next);
                }
            }
        }

        for (int i=2; i<=N; i++) {
            System.out.println(parents[i]);
        }

        sc.close();
    }
}
