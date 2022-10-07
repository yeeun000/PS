import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int A, B, C;
    static int s;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(br.readLine());
    }

    static void logic() {
        int s_B = s / 60;
        int s_C = s % 60;
        int b = B + s_B;
        int c = C + s_C;
        int a = A;
        int c_2 = 0, b_2 = 0;
        if (c > 59) {
            c_2 = c / 60;
            b = c_2 + b;
            c = c % 60;
        }
        if (b > 59) {
            b_2 = b / 60;
            a = b_2 + A;
            b = b % 60;
        }
        if (a > 23) {
            while(a>23){
                a=Math.abs(24-a);
            }
        }
        sb.append(a + " " + b + " " + c);
        System.out.println(sb);
    }
}
