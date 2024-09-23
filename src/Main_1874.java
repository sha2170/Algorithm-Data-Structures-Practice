import java.util.Scanner;
import java.util.Stack;

public class Main_1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sequence = new int[n];

        for (int i=0; i<n; i++) {
            sequence[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int current = 1; // 스택에 넣을 수 (1부터 n까지)

        for (int i=0; i<n; i++) {
            int target = sequence[i];

            while (current <= target) {
                stack.push(current);
                sb.append("+\n");
                current++;
            }

            if (stack.peek() == target) {
                stack.pop();
                sb.append("-\n");
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb.toString());
    }
}