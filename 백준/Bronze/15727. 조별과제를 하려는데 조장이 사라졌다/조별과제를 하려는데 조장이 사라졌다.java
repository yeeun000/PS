
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

        int Sum=N/5;
        int S=N%5;
        if(S!=0){
            sb.append(Sum+1);
        }
        else{
            sb.append(Sum);
        }
        System.out.println(sb);
    }
}
