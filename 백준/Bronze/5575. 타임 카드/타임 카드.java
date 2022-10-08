import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int[] A;
    static int[] B;
    static int[] C;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        A = new int[6];
        B = new int[6];
        C = new int[6];
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < 6; j++) {
            A[j] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < 6; j++) {
            B[j] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < 6; j++) {
            C[j] = Integer.parseInt(st.nextToken());
        }
    }
    static void logic(){
        int a=A[3]-A[0];
        int b=A[4]-A[1];
        int c=A[5]-A[2];
        if(c<0){
            b=b-1;
            c=c+60;
        }
        if(b<0){
            a=a-1;
            b=b+60;
        }
        sb.append(a+" "+b+" "+c).append('\n');
        a=B[3]-B[0];
        b=B[4]-B[1];
        c=B[5]-B[2];
        if(c<0){
            b=b-1;
            c=c+60;
        }
        if(b<0){
            a=a-1;
            b=b+60;
        }
        sb.append(a+" "+b+" "+c).append('\n');
        a=C[3]-C[0];
        b=C[4]-C[1];
        c=C[5]-C[2];
        if(c<0){
            b=b-1;
            c=c+60;
        }
        if(b<0){
            a=a-1;
            b=b+60;
        }
        sb.append(a+" "+b+" "+c).append('\n');
        System.out.println(sb);
    }
}
