package 백준.브루트포스;

import java.util.Scanner;
import java.util.Arrays;

public class Main_2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] skswoddl = new int[9];
        int totalSum = 0;

        for (int i=0; i<9; i++) {
            skswoddl[i] = sc.nextInt();
            totalSum += skswoddl[i];
        }

        // 불필요한 두 명 찾기
        outerLoop:
            for (int i=0; i<8; i++) {
                for (int j=i+1; j<9; j++) {
                    if (totalSum - skswoddl[i] - skswoddl[j] == 100) {
                        skswoddl[i] = -1;
                        skswoddl[j] = -1;
                        break outerLoop;
                    }
                }
            }

            Arrays.sort(skswoddl);
            for (int i=2; i<9; i++) {
                System.out.println(skswoddl[i]);
            }

            sc.close();
    }
}
