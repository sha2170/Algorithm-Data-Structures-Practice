package 백준.배열;

import java.util.Scanner;

public class Main_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 세 개의 숫자 입력받기
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int result = A * B * C;
        
        // 결과를 문자열로 변환
        String resultStr = Integer.toString(result);
        
        // 0부터 9까지 각각 몇 번 나오는지 저장하는 배열 생성
        int[] count = new int[10];
        
        // 나타나는 횟수 세기
        for (int i = 0; i < resultStr.length(); i++) {
            char digit = resultStr.charAt(i);
            int digitValue = Character.getNumericValue(digit);
            count[digitValue]++;
        }
        
        // 결과 출력
        for (int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }

        sc.close();
    }
}