import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int T;
    static int []arr;
    public static void main(String[]args)throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        T=Integer.parseInt(br.readLine());
        arr=new int[10];
        for(int i=0;i<T;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<10;j++){
                arr[j]=Integer.parseInt(st.nextToken());
            }
            logic();
        }
        System.out.println(sb);
    }
    static void logic(){
        Arrays.sort(arr);
        sb.append(arr[7]).append("\n");
    }
}

