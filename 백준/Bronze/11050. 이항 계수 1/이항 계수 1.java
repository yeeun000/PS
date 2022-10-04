
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int N,K;
    public static void main(String[]args)throws IOException{
        input();
        logic();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        st=new StringTokenizer(br.readLine());
        sb=new StringBuilder();
        N=Integer.parseInt(st.nextToken());
        K=Integer.parseInt(st.nextToken());
    }
    static void logic(){
        int Sum_N=1;
        int Sum_K=1;
        int Sum_N_K=1;
        for(int i=N;i>0;i--){
            Sum_N*=i;
        }
        for(int i=K;i>0;i--){
            Sum_K*=i;
        }
        for(int i=N-K;i>0;i--){
            Sum_N_K*=i;
        }
        int Sum=Sum_N/(Sum_K*Sum_N_K);
        sb.append(Sum);
        System.out.println(sb);
    }
}
