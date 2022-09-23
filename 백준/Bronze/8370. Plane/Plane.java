import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    public static void main(String[]args) throws IOException{
        input();
        logic();
    }
    static void input() throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        st=new StringTokenizer(br.readLine());
        sb=new StringBuilder();

    }
    static void logic(){
            int n=Integer.parseInt(st.nextToken());
            int k=Integer.parseInt(st.nextToken());
            int n1=Integer.parseInt(st.nextToken());
            int k1=Integer.parseInt(st.nextToken());
            int Sum=n*k+n1*k1;
            sb.append(Sum);
            System.out.println(sb);
    }
}
