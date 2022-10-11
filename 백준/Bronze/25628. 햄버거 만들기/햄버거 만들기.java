
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int A,B;
    public static void main(String[]args)throws IOException{
        input();
        logic();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        st=new StringTokenizer(br.readLine());
        sb=new StringBuilder();
        A=Integer.parseInt(st.nextToken());
        B=Integer.parseInt(st.nextToken());
    }
    static void logic(){
        if(A/2<B)
            sb.append(A/2);
        else sb.append(B);
        System.out.println(sb);
    }
}
