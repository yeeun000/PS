import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());
        int []arr=new int[N];
        int []s=new int [N-K+1];
        st=new StringTokenizer(br.readLine());
        int p=0;
        for(int i=0;i<K;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            s[p]+=arr[i];
        }
        int q=0;
        for(int i=K;i<N;i++){
            p++;
            arr[i]=Integer.parseInt(st.nextToken());
            s[p]=s[p-1]+arr[i]-arr[q];
            q++;
        }
        Arrays.sort(s);
       sb.append(s[N-K]);
        System.out.println(sb);
    }
}
