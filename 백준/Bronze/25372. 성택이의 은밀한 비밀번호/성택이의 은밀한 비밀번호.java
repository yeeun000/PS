
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static String str;
    static int N;
    public static void main(String[]args)throws IOException{
        input();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            str=br.readLine();
            logic();
        }
        System.out.println(sb);

    }
    static void logic(){
        if(str.length()<=9 && str.length()>=6)
            sb.append("yes").append('\n');
        else sb.append("no").append('\n');
    }
}
