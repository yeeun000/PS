import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int c=Integer.parseInt(st.nextToken());
        int sum=0;
        if(a>N)
            sum+=N;
        else sum+=a;
        if(b>N)
            sum+=N;
        else sum+=b;
        if(c>N)
            sum+=N;
        else sum+=c;
        sb.append(sum);
        System.out.println(sb);
    }
}
