
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int N;
    public static void main(String[]args) throws IOException{
        input();
        logic();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        N=Integer.parseInt(br.readLine());
    }
    static void logic(){
        for(int i=N;i>0;i--){
            sb.append(i).append('\n');
        }
        System.out.println(sb);
    }
}
