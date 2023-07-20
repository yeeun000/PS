import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int arr[]=new int [3];
        arr[0]=Integer.parseInt(st.nextToken());
        arr[1]=Integer.parseInt(st.nextToken());
        arr[2]=Integer.parseInt(st.nextToken());
        int arr_b []=new int [arr[0]];
        int arr_c []=new int [arr[1]];
        int arr_d []=new int [arr[2]];
        int sum=0;
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<arr[0];i++){
            arr_b[i]=Integer.parseInt(st.nextToken());
            sum+=arr_b[i];
        }
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<arr[1];i++){
            arr_c[i]=Integer.parseInt(st.nextToken());
            sum+=arr_c[i];
        }
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<arr[2];i++){
            arr_d[i]=Integer.parseInt(st.nextToken());
            sum+=arr_d[i];
        }
        int ar[]=new int [3];
        for(int i=0;i<3;i++){
            ar[i]=arr[i];
        }
        Arrays.sort(ar);
        Arrays.sort(arr_b);
        Arrays.sort(arr_c);
        Arrays.sort(arr_d);
        int sum_a=0;
        for(int i=0;i<ar[0];i++){
            sum_a+=(arr_b[arr[0]-i-1]+arr_c[arr[1]-i-1]+arr_d[arr[2]-i-1])*0.1;
        }
        int sum_re=sum-sum_a;
        sb.append(sum).append("\n").append(sum_re);
        System.out.println(sb);
    }
}
