
import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static BigInteger N,M;
    static int A,B;
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
        N=new BigInteger(br.readLine());
        M=new BigInteger(br.readLine());
    }
    static void logic(){
        BigInteger Sum;
        Sum=N.multiply(M);
        sb.append(Sum);
        System.out.println(sb);
    }
}
