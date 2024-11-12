import java.util.Scanner;

public class Main_2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 카드의 개수
        int M = sc.nextInt(); // 목표 합

        int[] card = new int[N];
        for (int i=0; i<N; i++) {
            card[i] = sc.nextInt();
        }

        int maxSum = 0;

        for (int i=0; i<N-2; i++) {
            for (int j=i+1; j<N-1; j++) {
                for (int k=j+1; k<N; k++) {
                    int sum = card[i] + card[j] + card[k];

                    if (sum <= M && sum > maxSum) {
                        maxSum = sum;
                    }
                }
            }
        }


        System.out.println(maxSum);
        sc.close();
    }
}
