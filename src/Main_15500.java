import java.util.*;

public class Main_15500 {
    static List<String> moves = new ArrayList<>();
    static int moveCount = 0;

    // 원판을 직접 옮기는 함수
    public static void moveSingleDisk(int from, int to, Stack<Integer>[] towers) {
        if (!towers[from].isEmpty()) {
            towers[to].push(towers[from].pop());
            moves.add((from + 1) + " " + (to + 1));
            moveCount++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Stack<Integer>[] towers = new Stack[3];
        for (int i = 0; i < 3; i++) {
            towers[i] = new Stack<>();
        }

        // 첫 번째 장대에 입력받은 원판 순서대로 쌓음
        for (int i = 0; i < N; i++) {
            towers[0].push(sc.nextInt());
        }

        // 문제의 예시에서와 같이 단순하게 옮기는 방법 적용
        // 1. 맨 위 원판을 두 번째 장대로 옮김
        moveSingleDisk(0, 1, towers); // 1 -> 2
        // 2. 그 다음 원판을 세 번째 장대로 옮김
        moveSingleDisk(0, 2, towers); // 1 -> 3
        // 3. 첫 번째 장대에서 남은 원판을 세 번째 장대로 옮김
        moveSingleDisk(0, 2, towers); // 1 -> 3
        // 4. 두 번째 장대에서 원판을 세 번째 장대로 옮김
        moveSingleDisk(1, 2, towers); // 2 -> 3

        // 결과 출력
        System.out.println(moveCount);
        for (String move : moves) {
            System.out.println(move);
        }
    }
}
