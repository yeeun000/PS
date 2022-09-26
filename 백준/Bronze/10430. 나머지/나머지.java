
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int A,B,C;
    public static void main(String[]args)throws IOException{
        input();
        logic();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        st=new StringTokenizer(br.readLine());
        sb=new StringBuilder();
        A=Integer.parseInt(st.nextToken());
        B=Integer.parseInt(st.nextToken());
        C=Integer.parseInt(st.nextToken());
    }
    static void logic(){
     int Sum= (A+B)%C;
     int Sum1=((A%C) + (B%C))%C;
     int Sum2=(A*B)%C;
     int Sum3=((A%C) * (B%C))%C;
     sb.append(Sum).append('\n').append(Sum1).append('\n').append(Sum2).append('\n').append(Sum3);
     System.out.println(sb);
    }
}
