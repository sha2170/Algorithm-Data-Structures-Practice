import java.util.Scanner;
import java.util.ArrayList;
public class Main_10828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> stack = new ArrayList<>();
        int N = sc.nextInt();

        for (int i=0; i<N; i++) {
            String command = sc.next();

            switch (command) {
                case "push":
                    int value = sc.nextInt();
                    stack.add(value);
                    break;

                case "pop":
                    if (stack.isEmpty()) {
                        System.out.println(-1);
                    }
                    else {
                        System.out.println(stack.remove(stack.size() -1));
                    }
                    break;

                case "size":
                    System.out.println(stack.size());
                    break;

                case "empty":
                    System.out.println(stack.isEmpty() ? 1 : 0);
                    break;

                case "top":
                    if (stack.isEmpty()) {
                        System.out.println(-1);
                    }
                    else {
                        System.out.println(stack.get(stack.size() -1));
                    }
                    break;
            }
        }

        sc.close();
    }
}
