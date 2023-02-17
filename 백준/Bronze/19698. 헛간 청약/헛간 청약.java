import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int W=Integer.parseInt(st.nextToken());
        int H=Integer.parseInt(st.nextToken());
        int L=Integer.parseInt(st.nextToken());
        int sum=0;
        sum=W/L;
        sum*=(H/L);
        if(sum<N)
            sb.append(sum);
        else sb.append(N);
        System.out.println(sb);
    }
}
