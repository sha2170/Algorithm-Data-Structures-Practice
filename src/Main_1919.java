import java.util.Scanner;
public class Main_1919 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 단어 입력 받기
		String word1 = sc.nextLine();
		String word2 = sc.nextLine();
		
		// 각 알파벳이 나타나는 횟수 저장 배열 생성
		int [] num1 = new int[26]; // A-Z :26
		int [] num2 = new int[26];
		
		// 각 알파벳의 빈도수 세기
		for (char c : word1.toCharArray()) {
			num1[c - 'a']++; // a 기준으로 각 문자가 몇 번째 위치인지 
		}
		
		for (char c : word2.toCharArray()) {
			num2[c - 'a']++;
		}
		
		int count = 0; // count 제거해야할 알파벳 개수
		
		// num1과 num2에서의 개수 비교
		for(int i=0; i<26; i++) {
			count += Math.abs(num1[i] - num2[i]); 
		}

		System.out.println(count);
		
		sc.close();
		
	}

}
