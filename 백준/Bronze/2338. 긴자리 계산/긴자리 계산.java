
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static BigInteger A;
    static BigInteger B;
    public static void main(String[]args) throws IOException{
        input();
        logic();
    }
    static void input() throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        A=new BigInteger(br.readLine());
        B=new BigInteger(br.readLine());
    }
    static void logic(){
        BigInteger bi_add=A.add(B);
        BigInteger bi_sub=A.subtract(B);
        BigInteger bi_mul=A.multiply(B);

        sb.append(bi_add).append('\n').append(bi_sub).append('\n').append(bi_mul);
        System.out.println(sb);
    }

}
