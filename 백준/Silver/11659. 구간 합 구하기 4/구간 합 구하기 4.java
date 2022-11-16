import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        int []arr=new int[N+1];
        int sum[]=new int[N+1];
        for(int i=1;i<=N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            sum[i]+=sum[i-1]+arr[i];
        }
        for(int i=0;i<M;i++){
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            sb.append(sum[b]-sum[a-1]).append("\n");
        }
        System.out.println(sb);
    }
}
