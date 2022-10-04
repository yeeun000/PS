
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int a,b;
    public static void main(String[]args)throws IOException{
        input();
        logic();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
    }
    static void logic(){
        a=a*8;
        b=b*3;
        int Sum=a+b-28;
        sb.append(Sum);
        System.out.println(sb);
    }
}
