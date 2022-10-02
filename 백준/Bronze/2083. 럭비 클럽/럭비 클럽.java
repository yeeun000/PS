
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static String str;
    static int A,B;
    public static void main(String[]args)throws IOException{
        input();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        while(true){
            st=new StringTokenizer(br.readLine());
            str=st.nextToken();
            A=Integer.parseInt(st.nextToken());
            B=Integer.parseInt(st.nextToken());
            if(str.equals("#")&&A==0&&B==0)
                break;
            logic();
        }
        System.out.println(sb);
    }
    static void logic(){
        if(A>17 || B>=80)
            sb.append(str+" Senior").append('\n');
        else sb.append(str+" Junior").append('\n');
    }
}
