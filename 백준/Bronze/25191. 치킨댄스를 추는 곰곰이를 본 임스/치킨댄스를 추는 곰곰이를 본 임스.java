import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N,A,B;
    public static void main(String[]args)throws IOException{
        input();
        logic();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        N=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        A=Integer.parseInt(st.nextToken());
        B=Integer.parseInt(st.nextToken());
    }
    static void logic(){
        if(A/2+B>N)
            sb.append(N);
        else if(A/2+B<N)
            sb.append(A/2+B);
        else sb.append(N);
        System.out.println(sb);
    }
}
