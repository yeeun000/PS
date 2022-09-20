
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int T;
    static int []A;
    static int []B;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        T = Integer.parseInt(br.readLine());
        A=new int[T];
        B=new int[T];


        for(int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine());
            A[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(st.nextToken());
        }

    }

    static void logic() {
        for(int i=0;i<T;i++) {
            int ans=A[i] + B[i];
            sb.append("Case #"+(i+1)+": "+A[i]+" + "+B[i]+" = "+ans).append('\n');
        }
        System.out.println(sb);
    }
}