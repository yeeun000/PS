import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int T=Integer.parseInt(br.readLine());
        for(int s=0;s<T;s++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            Arrays.sort(arr);
            for (int j = 0; j < M; j++) {
                int X = Integer.parseInt(st.nextToken());
                sb.append(binary(arr, 0, N - 1, X)).append("\n");
            }
        }
        System.out.println(sb);
    }
    static int binary(int []arr,int L,int R,int X){
        while(L<=R){
            int mid=(L+R)/2;
            if(arr[mid]==X)
                return 1;
            else if(arr[mid]<X)
                L=mid+1;
            else R=mid-1;
        }
        return 0;
    }
}
