import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int arr[]=new int [M];
        int ar[]=new int [M];
        for(int i=0;i<M;i++){
            st=new StringTokenizer(br.readLine());
            arr[i]=Integer.parseInt(st.nextToken());
            ar[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        Arrays.sort(ar);
        int a=N/6;
        int sum_a=a*arr[0];
        int sum_b=ar[0]*N;
        int sum_c=a*arr[0];
        if(N%6!=0) {
            sum_a += arr[0];
            sum_c+=ar[0]*(N%6);
        }
        if(sum_a>sum_b){
            if(sum_b>sum_c)
                sb.append(sum_c);
            else sb.append(sum_b);
        }
        else{
            if(sum_a>sum_c)
                sb.append(sum_c);
            else sb.append(sum_a);
        }
        System.out.println(sb);
    }
}
