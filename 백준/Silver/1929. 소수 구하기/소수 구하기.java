import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int N, M;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
    }

    static void logic() {
        int[] a = new int[1000001];
        for (int i = 2; i <= N; i++) {
            a[i] = i;
        }
        for (int i = 2; i <= N; i++) {
            if (a[i] == 0)
                continue;
            for (int j = 2 * i; j <= N; j+=i) {
                a[j] = 0;
            }
        }
        for (int i = M; i <= N; i++) {
            if (a[i] != 0)
                sb.append(a[i]).append('\n');
        }
        System.out.println(sb);
    }
}
