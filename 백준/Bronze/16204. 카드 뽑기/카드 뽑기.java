import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());
        int f=0,s=0;
        if(M>=K)
            f=K;
        else f=M;
        if(N-K>=N-M)
            s=N-M;
        else s=N-K;
        sb.append(f+s);
        System.out.println(sb);
    }
}
