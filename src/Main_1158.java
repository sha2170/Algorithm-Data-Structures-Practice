import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class Main_1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // N : 사람 수
		int K = sc.nextInt(); // K : K번째 사람 제거
		
		// 큐 : FIFO 형태 
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1; i<= N; i++) {
			queue.add(i); // 1번부터 N번까지 큐에 넣고 구분
		}
		
		System.out.print("<");
		
		while (!queue.isEmpty()) { // N명의 사람이 모두 제거될 때까지 반복
			for(int i=0; i<K-1; i++) {
				int person = queue.poll(); // k-1번 맨 앞 사람 제거
				queue.add(person); // 그 사람 다시 큐 맨 뒤로 추가
			}
			
			int byePerson = queue.poll(); // 제거된 사람 큐에서 제거
			if(queue.isEmpty()) {
				System.out.print(byePerson);
			}
			else {
				System.out.print(byePerson + ", ");
			}
			
		}

		System.out.println(">");
		sc.close();
	}

}
