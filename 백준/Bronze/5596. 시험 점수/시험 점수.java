import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int S, T;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        S = 0;
        T = 0;

        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < 4; j++) {
            int x = Integer.parseInt(st.nextToken());
            S+=x;
        }
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < 4; j++) {
            int y = Integer.parseInt(st.nextToken());
            T+=y;
        }
    }

    static void logic() {
        if(S<T)
            sb.append(T);
        else sb.append(S);
        System.out.println(sb);

    }
}
