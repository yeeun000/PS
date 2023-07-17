import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int L=Integer.parseInt(st.nextToken());
        int H=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        int []arr=new int [N];
        int sum=0;
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            sum+=arr[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<L;i++){
            sum-=arr[i];
        }
        for(int i=0;i<H;i++){
            sum-=arr[N-1-i];
        }
        double a=(double)sum/(N-L-H);
        sb.append(a);
        System.out.println(sb);
    }
}
