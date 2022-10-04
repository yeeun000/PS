
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int N;
    public static void main(String[]args)throws IOException{
        input();
        logic();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        N=Integer.parseInt(br.readLine());
    }
    static void logic(){
        double S=N-N*0.22;
        double a=N-N*0.2*0.22;
        int v=(int)S;
        int b=(int)a;
        sb.append(v+" "+b);
        System.out.println(sb);
    }
}
