import java.util.*;
import java.io.*;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static String str;
    static char[] ch;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        str = br.readLine();
        ch = str.toCharArray();
    }

    static void logic() throws IOException {
        int c;
        for (int j = 97; j < 123; j++) {
            c = 0;
            for (int i = 0; i < str.length(); i++) {
                if (ch[i] == j) {
                    c++;
                    sb.append(i).append(" ");
                    break;
                }
            }
            if (c == 0)
                sb.append("-1").append(" ");
        }
        System.out.println(sb);
    }
}
