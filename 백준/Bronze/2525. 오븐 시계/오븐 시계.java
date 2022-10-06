import java.nio.Buffer;
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int A,B,C;
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
        C=Integer.parseInt(br.readLine());
    }
    static void logic(){
        int x=B+C;
        int x_A=0;
        if(x>59){
            x_A=x/60;
            x=x%60;
        }
        A+=x_A;
        if(A>23){
            A=A-24;
        }
        sb.append(A+" "+x);
        System.out.println(sb);
    }
}
