import java.io.*;
import java.util.*;
public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int []arr;
    public static void main(String[]args)throws IOException{
        input();
        logic();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        st=new StringTokenizer(br.readLine());
        sb=new StringBuilder();
        arr=new int [3];
        for(int i=0;i<3;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
    }
    static void logic(){
        Arrays.sort(arr);
        sb.append(arr[1]);
        System.out.println(sb);
    }
}
