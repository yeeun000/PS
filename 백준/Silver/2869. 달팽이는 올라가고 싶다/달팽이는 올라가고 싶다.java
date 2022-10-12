import java.io.*;
import java.util.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int A,B,V;
    public static void main(String[]args)throws IOException{
        input();
        logic();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        st=new StringTokenizer(br.readLine());
        A=Integer.parseInt(st.nextToken());
        B=Integer.parseInt(st.nextToken());
        V=Integer.parseInt(st.nextToken());
    }
    static void logic(){
        int c,i;
       c=(V-A+(A-B))/(A-B);
       i=(V-A+(A-B))%(A-B);
       if(i==0)
           sb.append(c);
       else sb.append(c+1);
        System.out.println(sb);
    }
}
