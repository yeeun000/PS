import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        long a=Integer.parseInt(st.nextToken());
        long b =Integer.parseInt(st.nextToken());
        long c=Integer.parseInt(st.nextToken());
        long sum=go(a,b,c);
        sb.append(sum);
        System.out.println(sb);
    }
    static long go(long a,long b,long c){
        if(b==1)
            return a%c;
        long s=go(a,b/2,c);
        if(b%2==1) {
            return s=s*s%c*a%c;
        }
        else {
           return s =s*s%c;
        }
    }
}
