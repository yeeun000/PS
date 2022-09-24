
import java.math.BigInteger;
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static BigInteger A,B;
    public static void main(String[]args) throws IOException{
        input();
        logic();
    }
    static void input() throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        st=new StringTokenizer(br.readLine());
        sb=new StringBuilder();
        A=new BigInteger(st.nextToken());
        B=new BigInteger(st.nextToken());
    }
    static void logic(){
        BigInteger Sum=A.add(B);
        sb.append(Sum);
        System.out.println(sb);
    }
}
