import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int []arr=new int [N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int sum=0;
        for(int i=1;i<=N;i++){
            for(int j=0;j<i;j++){
                sum+=arr[j];
            }
        }
        sb.append(sum);
        System.out.println(sb);
    }
}
