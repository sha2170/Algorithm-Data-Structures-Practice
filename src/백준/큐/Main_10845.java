package 백준.큐;

import java.util.Scanner;
import java.util.LinkedList;

public class Main_10845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        LinkedList<Integer> queue = new LinkedList<>();

        for (int i=0; i<N; i++) {
            String command = sc.nextLine();

            if (command.startsWith("push")) {
                int value = Integer.parseInt(command.split(" ")[1]);
                queue.add(value);
            } else if (command.equals("pop")) {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue.poll());
                }
            } else if (command.equals("size")) {
                System.out.println(queue.size());
            } else if (command.equals("empty")) {
                System.out.println(queue.isEmpty() ? 1 : 0);
            } else if (command.equals("front")) {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue.peek());
                }
            } else if (command.equals("back")) {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(queue.peekLast());
                }
            }
        }

        sc.close();
    }
}
