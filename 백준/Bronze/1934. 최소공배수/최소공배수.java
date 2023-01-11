import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();
        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            st=new StringTokenizer(br.readLine());
            int A=Integer.parseInt(st.nextToken());
            int B=Integer.parseInt(st.nextToken());
            int re=gcd(A,B);
            re=(A*B)/re;
            sb.append(re).append("\n");
        }
        System.out.println(sb);
    }
    static int gcd(int a,int b){
        if(b==0)
            return a;
        else return gcd(b,a%b);
    }
}
