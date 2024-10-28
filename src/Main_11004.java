import java.util.Arrays;

public class Main_11004 {
    public int[] Main_11004(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i=0; i<commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int k = commands[i][2] - 1;

            int[] subArray = Arrays.copyOfRange(array, start, end);
            Arrays.sort(subArray);

            answer[i] = subArray[k];
        }

        return answer;
    }


}
