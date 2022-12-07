import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        StringBuilder sb=new StringBuilder();
        int A=Integer.parseInt(st.nextToken());
        int B=Integer.parseInt(st.nextToken());
        int re=gcd(A,B);
        sb.append(re).append("\n");
        re=(A*B)/re;
        sb.append(re);
        System.out.println(sb);
    }
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else return gcd(b, a % b);
    }
}
