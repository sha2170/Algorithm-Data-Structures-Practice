package 백준.힙;

import java.io.*;
import java.util.*;

public class Main_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 듣도 못한 사람 수
        int M = Integer.parseInt(st.nextToken()); // 보도 못한 사람 수

        HashSet<String> unheard = new HashSet<>();

        for (int i=0; i<N; i++) {
            unheard.add(br.readLine());
        }

        ArrayList<String> result = new ArrayList<>();

        for (int i=0; i<M; i++) {
            String name = br.readLine();
            if (unheard.contains(name)) {
                result.add(name);
            }
        }

        Collections.sort(result);

        bw.write(result.size() + "\n");

        for (String name : result) {
            bw.write(name + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
