import java.util.Scanner;
import java.util.Stack;

public class Main_9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc. nextInt();
        sc.nextLine();

        for (int i=0; i<T; i++) {
            String ps = sc.nextLine();
            System.out.println(isVPS(ps));
        }
    }

    public static String isVPS(String ps) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < ps.length(); i++) {
            char ch = ps.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if(stack.isEmpty()) {
                    return "NO";
                } else {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }
}
