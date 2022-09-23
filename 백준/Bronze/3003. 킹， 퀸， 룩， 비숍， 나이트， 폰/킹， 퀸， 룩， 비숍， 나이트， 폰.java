
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int []arr;
    public static void main(String[]args) throws IOException{
        input();
        logic();
    }
    static void input() throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        st=new StringTokenizer(br.readLine());
        sb=new StringBuilder();
        arr=new int [6];
        for(int i=0;i<6;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
    }
    static void logic(){
        int [] chess={1,1,2,2,2,8};
        for(int i=0;i<6;i++){
            int re=chess[i]-arr[i];
            sb.append(re).append(" ");
        }
        System.out.println(sb);
    }
}
