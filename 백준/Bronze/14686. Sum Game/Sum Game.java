import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int arr[]=new int [N];
        int ar[]=new int [N];
        int sum_arr[]=new int[N];
        int sum_ar[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            if(i!=0)
            sum_arr[i]=sum_arr[i-1]+arr[i];
            else sum_arr[0]=arr[0];
        }
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            ar[i]=Integer.parseInt(st.nextToken());
            if(i!=0)
                sum_ar[i]=sum_ar[i-1]+ar[i];
            else sum_ar[0]=ar[0];
        }
        sum_ar[0]=ar[0];
        int i=N-1;
        while(i>-1){
            if(sum_arr[i]==sum_ar[i]) {
                break;
            }
            i--;
        }
        sb.append(i+1);
        System.out.println(sb);
    }
}
