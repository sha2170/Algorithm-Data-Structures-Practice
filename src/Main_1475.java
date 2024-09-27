
import java.util.Scanner;
public class Main_1475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ** 6과 9를 뒤집어서 사용 가능하다는 점.

		String N = sc.nextLine(); // N : 방 번호
		
		// 0-9가 한 세트 | 0부터 9까지의 빈도 수 저장 배열 numCount
		int[] numCount = new int[10];
		
		for(int i=0; i<N.length(); i++) {
			int num = N.charAt(i) - '0'; // 해당 숫자가 '0'을 기준으로 몇 번째 위치인지
			numCount[num]++;	
		}
		
		int sixNineCount = numCount[6] + numCount[9];
		
		numCount[6] = (sixNineCount + 1) / 2; // sixNineCount = 3 > 2개 , =4 > 2개
		
		int setCount = 0; // setCount : 필요한 세트 수
		
		for(int i = 0; i<9; i++) {
			if(numCount[i] > setCount) {
				setCount = numCount[i];
			}
		}
		
		System.out.println(setCount);
		sc.close();
	}

}
