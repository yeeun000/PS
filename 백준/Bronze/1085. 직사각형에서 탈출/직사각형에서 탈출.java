
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int x,y,w,h;
    public static void main(String[]args)throws IOException{
        input();
        logic();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        st=new StringTokenizer(br.readLine());
        sb=new StringBuilder();
        x=Integer.parseInt(st.nextToken());
        y=Integer.parseInt(st.nextToken());
        w=Integer.parseInt(st.nextToken());
        h=Integer.parseInt(st.nextToken());
    }
    static void logic(){
        int []arr=new int [4];
        arr[0]=x;
        arr[1]=y;
        arr[2]=h-y;
        arr[3]=w-x;
        Arrays.sort(arr);
        sb.append(arr[0]);
        System.out.println(sb);
    }
}
