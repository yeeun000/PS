
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main{
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static BigInteger N,M;
    public static void main(String[]args) throws IOException{
        input();
        logic();
    }
    static void input() throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        st=new StringTokenizer(br.readLine());
        sb=new StringBuilder();
        N=new BigInteger(st.nextToken());
        M=new BigInteger(st.nextToken());

    }
    static void logic(){
        BigInteger div=N.divide(M);
        BigInteger re=N.remainder(M);
        sb.append(div).append('\n').append(re);
        System.out.println(sb);

    }

}
