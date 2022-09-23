
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static Long A,B;
    public static void main(String[]args) throws IOException{
        input();
        logic();
    }
    static void input() throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        st=new StringTokenizer(br.readLine());
        sb=new StringBuilder();
        A=Long.parseLong(st.nextToken());
        B=Long.parseLong(st.nextToken());
    }
    static void logic(){
        sb.append((A+B)*(A-B));
        System.out.println(sb);
    }
}
