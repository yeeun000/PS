
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int N;
    static int Sum;
    public static void main(String[]args)throws IOException{
        input();
        logic();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        Sum=0;
        for(int i=0;i<4;i++){
            N=Integer.parseInt(br.readLine());
            Sum+=N;
        }
    }
    static void logic(){
        int x,y;
        x=Sum/60;
        y=Sum%60;
        sb.append(x).append('\n').append(y);
        System.out.println(sb);
    }
}
