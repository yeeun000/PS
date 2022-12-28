import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int []s=new int [N+1];
        for(int i=1;i<=N;i++){
            s[i]=s[i-1]+Integer.parseInt(st.nextToken());
        }
        int M=Integer.parseInt(br.readLine());
        for(int i=0;i<M;i++){
            st=new StringTokenizer(br.readLine());
            int A=Integer.parseInt(st.nextToken());
            int B=Integer.parseInt(st.nextToken());
            sb.append(s[B]-s[A-1]).append("\n");
        }
        System.out.println(sb);
    }
}
