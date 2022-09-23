
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int N;
    static int []arr;
    public static void main(String[]args)throws IOException{
        input();
        logic();
    }
    static void input() throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        N=Integer.parseInt(br.readLine());
        String st1=br.readLine();
        String[] str=st1.split("");
        arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(str[i]);
        }
    }
    static void logic(){
        int Sum=0;
        for(int i=0;i<N;i++){
            Sum+=arr[i];
        }
        sb.append(Sum);
        System.out.println(sb);
    }
}
