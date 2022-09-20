
import java.util.*;
import java.io.*;

public class Main{
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static long A,B,C;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());
        C = Long.parseLong(st.nextToken());


    }

    static void logic() {
        long ans;
        ans=A+B+C;
        sb.append(ans);
        System.out.println(sb);
    }
}