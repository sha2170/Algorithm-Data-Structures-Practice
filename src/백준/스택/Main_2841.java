package 백준.스택;

import java.util.Scanner;
import java.util.Stack;

public class Main_2841 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // N 멜로디의 음 개수
        int P = sc.nextInt(); // P 프렛의 개수

        Stack<Integer>[] strings = new Stack[7];
        for (int i=1; i<=6; i++) {
            strings[i] = new Stack<>();
        }

        int movements = 0; // movements 손가락 움직임 수

        for (int i=0; i<N; i++) {
            int stringNum = sc.nextInt();
            int fretNum = sc.nextInt();

            while (!strings[stringNum].isEmpty() && strings[stringNum].peek() > fretNum) {
                strings[stringNum].pop();
                movements++; // 손가락을 떼는 동작
            }

            if (strings[stringNum].isEmpty() || strings[stringNum].peek() != fretNum) {
                strings[stringNum].push(fretNum);
                movements++; // 손가락을 누르는 동작
            }
        }

        System.out.println(movements);
        sc.close();
    }
}
