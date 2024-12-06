package 백준.큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_1966 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt(); // 테스트케이스 개수

        for (int t = 0; t < testCases; t++) {
            int N = sc.nextInt(); // 문서의 개수
            int M = sc.nextInt(); // 궁금한 문서의 위치

            Queue<int[]> queue = new LinkedList<>(); // [문서의 중요도, 인덱스]를 저장
            int[] priorities = new int[N]; // 중요도 저장 배열

            for (int i = 0; i < N; i++) {
                int priority = sc.nextInt();
                queue.add(new int[] {priority, i}); // 중요도와 인덱스 저장
                priorities[i] = priority;
            }

            int printOrder = 0; // 출력 순서

            while (!queue.isEmpty()) {
                int[] current = queue.poll(); // 현재 문서를 꺼낸다
                boolean hasHigherPriority = false;

                // 큐에 남아있는 문서들 중 더 높은 중요도가 있는지 확인
                for (int[] doc : queue) {
                    if (doc[0] > current[0]) {
                        hasHigherPriority = true;
                        break;
                    }
                }

                if (hasHigherPriority) {
                    // 현재 문서보다 중요도가 높은 문서가 있으면 뒤로 보냄
                    queue.add(current);
                } else {
                    // 현재 문서가 가장 중요하다면 인쇄
                    printOrder++;

                    if (current[1] == M) {
                        // 궁금한 문서가 출력되었는지 확인
                        System.out.println(printOrder);
                        break;
                    }
                }
            }
        }
        sc.close();
    }
}
