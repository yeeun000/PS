package PS;
import java.io.*;
import java.util.*;
public class Boj10811 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int []arr=new int [N];
        int []ar=new int [N];
        for(int i=0;i<N;i++){
            arr[i]=i+1;
            ar[i]=i+1;
        }
        for(int i=0;i<M;i++){
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int q=b-1;
            for(int j=a-1;j<b;j++){
                ar[j]=arr[q];
                q--;
            }
            for(int j=0;j<N;j++){
                arr[j]=ar[j];
            }
        }
        for(int i=0;i<N-1;i++){
            sb.append(arr[i]).append(" ");
        }
        sb.append(arr[N-1]);
        System.out.println(sb);
    }
}
