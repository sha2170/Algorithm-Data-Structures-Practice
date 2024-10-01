import java.util.Scanner;
import java.util.Arrays;

public class Main_2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] numbers = new int[N];

        for (int i=0; i<N; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        for (int num : numbers) {
            System.out.println(num);
        }

        sc.close();
    }
}