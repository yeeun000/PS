
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int a,b,c,d,e;
    public static void main(String[]args)throws IOException{
        input();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        for(int i=0;i<2;i++){
            st=new StringTokenizer(br.readLine());
            a=Integer.parseInt(st.nextToken());
            b=Integer.parseInt(st.nextToken());
            c=Integer.parseInt(st.nextToken());
            d=Integer.parseInt(st.nextToken());
            e=Integer.parseInt(st.nextToken());
            logic();
        }
        System.out.println(sb);
    }
    static void logic(){
        a=a*6;
        b=b*3;
        c=c*2;
        d=d*1;
        e=e*2;
        int Sum=a+b+c+d+e;
        sb.append(Sum+" ");
    }
}
