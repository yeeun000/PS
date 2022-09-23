
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int T,A,B;
    public static void main(String[]args) throws IOException{
        input();
    }
    static void input() throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        T=Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            st=new StringTokenizer(br.readLine());
            A=Integer.parseInt(st.nextToken());
            B=Integer.parseInt(st.nextToken());
            int Sum=A+B;
            sb.append(Sum).append('\n');
        }
        System.out.println(sb);
    }
}
