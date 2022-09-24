
import java.util.*;
import java.io.*;
public class Main {
    static StringBuilder sb;
    static StringTokenizer  st;
    static BufferedReader br;
    static int N;
    static int []arr;
    public static void main(String[]args) throws IOException{
        input();
        logic();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        N=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
    }
    static void logic(){
        Arrays.sort(arr);
        sb.append(arr[0]).append(" ").append(arr[N-1]);
        System.out.println(sb);
    }
}
