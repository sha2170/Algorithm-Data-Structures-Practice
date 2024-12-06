package 백준.덱;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class Main_10866 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> deque = new LinkedList<>();


        int N = Integer.parseInt(br.readLine());


        String command;

        for (int i = 0; i < N; i++) {
            command = br.readLine();

            if (command.startsWith("push_front")) {

                int X = Integer.parseInt(command.split(" ")[1]);
                deque.addFirst(X);
            } else if (command.startsWith("push_back")) {

                int X = Integer.parseInt(command.split(" ")[1]);
                deque.addLast(X);
            } else if (command.equals("pop_front")) {

                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(deque.pollFirst() + "\n");
                }
            } else if (command.equals("pop_back")) {

                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(deque.pollLast() + "\n");
                }
            } else if (command.equals("size")) {

                bw.write(deque.size() + "\n");
            } else if (command.equals("empty")) {

                bw.write((deque.isEmpty() ? 1 : 0) + "\n");
            } else if (command.equals("front")) {

                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(deque.peekFirst() + "\n");
                }
            } else if (command.equals("back")) {

                if (deque.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(deque.peekLast() + "\n");
                }
            }
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
