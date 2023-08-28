import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        int sum[]=new int [N];
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            int arr[]=new int [5];
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            if(a<b)
                sum[i]=b;
            else sum[i]=a;
            for(int j=0;j<5;j++){
                arr[j]=Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            sum[i]+=arr[3]+arr[4];
        }
        Arrays.sort(sum);
        sb.append(sum[N-1]);
        System.out.println(sb);
    }
}
