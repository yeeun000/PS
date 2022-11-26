import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        int []arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        long sum=0;
        for(int i=0;i<N;i++){
            if((arr[N-1-i]-i)<0)
                continue;
         sum+=arr[N-1-i]-i;
        }
        sb.append(sum);
        System.out.println(sb);
    }
}
