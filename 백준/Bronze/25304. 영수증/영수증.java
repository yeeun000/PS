
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int N,X,a,b,Sum=0;
    public static void main(String[]args)throws IOException{
        input();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        X=Integer.parseInt(br.readLine());
        N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            a=Integer.parseInt(st.nextToken());
            b=Integer.parseInt(st.nextToken());
            logic();
        }
        if(Sum==X)
            sb.append("Yes");
        else sb.append("No");
        System.out.println(sb);
    }
    static void logic(){
        int Cnt=a*b;
        Sum+=Cnt;
    }
}
