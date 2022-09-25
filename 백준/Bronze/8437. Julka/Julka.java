
import java.math.BigInteger;
import java.io.*;
public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static BigInteger N;
    static BigInteger M;
    public static void main(String[]args) throws IOException{
        input();
        logic();
    }
    static void input() throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        N=new BigInteger(br.readLine());
        M=new BigInteger(br.readLine());
    }
    static void logic(){
        BigInteger A=N.add(M);
        A=A.divide(BigInteger.valueOf(2));
        BigInteger B=N.subtract(A);
        sb.append(A).append('\n').append(B);
        System.out.println(sb);
    }
}
