package 백준.힙;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main_1927 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i=0; i<N; i++) {
            int x = sc.nextInt();

            if (x==0) {
                if (minHeap.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(minHeap.poll());
                }
            } else {
                minHeap.add(x);
            }
        }

        sc.close();
    }
}
