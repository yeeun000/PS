import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int H, M;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        H = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
    }

    static void logic() {
        if (M < 45) {
            if (H == 0)
                H = 23;
            else H = H - 1;
            M = M - 45;
            M = 60 + M;
        }
        else M=M-45;
        sb.append(H).append(" ").append(M);
        System.out.println(sb);
    }
}
