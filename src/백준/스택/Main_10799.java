package 백준.스택;

import java.util.Scanner;
import java.util.Stack;

public class Main_10799 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // 괄호 입력

        Stack<Character> stack = new Stack<>();
        int totalPieces = 0; // 총 잘린 조각 수

        for (int i=0; i<input.length(); i++) {
            char current = input.charAt(i);

            if (current == '(') {
                stack.push(current);
            } else {
                stack.pop();

                if (input.charAt(i-1) == '(') {
                    totalPieces += stack.size();
                } else {
                    totalPieces++;
                }
            }
        }

        System.out.println(totalPieces);
        sc.close();
    }
}
