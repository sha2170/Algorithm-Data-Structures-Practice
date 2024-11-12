import java.util.Scanner;

public class Main_2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;

        for (int i=1; i<N; i++) {
            int sum = i;
            int number = i;

            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if (sum == N) {
                result += i;
                break;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
