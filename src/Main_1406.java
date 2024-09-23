import java.io.*;
import java.util.*;

public class Main_1406 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String initialString = br.readLine();

        int M = Integer.parseInt(br.readLine());

        LinkedList<Character> editor = new LinkedList<>();
        for (char ch : initialString.toCharArray()) {
            editor.add(ch);
        }

        ListIterator<Character> cursor = editor.listIterator(editor.size());

        for (int i=0; i<M; i++) {
            String command = br.readLine();

            switch (command.charAt(0)) {
                case 'L':
                    if (cursor.hasPrevious()) {
                        cursor.previous();
                    }
                    break;

                case 'D':
                    if (cursor.hasNext()) {
                        cursor.next();
                    }
                    break;

                case 'B':
                    if (cursor.hasPrevious()) {
                        cursor.previous();
                        cursor.remove();
                    }
                    break;

                case 'P':
                    char addChar = command.charAt(2);
                    cursor.add(addChar);
                    break;
            }
        }

        for (char ch : editor) {
            sb.append(ch);
        }

        System.out.println(sb);
    }
}
