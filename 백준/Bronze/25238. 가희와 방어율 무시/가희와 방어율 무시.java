
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static float a,b;
    public static void main(String[]args)throws IOException{
        input();
        logic();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        st=new StringTokenizer(br.readLine());
        sb=new StringBuilder();
        a=Float.parseFloat(st.nextToken());
        b=Float.parseFloat(st.nextToken());
    }
    static void logic(){
        b=b/100;
        float S=a-a*b;
        if(S>=100)
            sb.append("0");
        else sb.append("1");
        System.out.println(sb);
    }
}
