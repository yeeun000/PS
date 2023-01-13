import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());
        int []arr=new int [N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        int cnt=0;
        for(int i=N-1;i>=0;i--){
            if(arr[i]<=K){
                cnt+=(K/arr[i]);
                K=K%arr[i];
            }
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}
