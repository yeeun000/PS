import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        int max=0;
        for(int i=0;i<N;i++){
            int sum=0;
            st=new StringTokenizer(br.readLine());
            int []arr=new int [3];
            arr[0]=Integer.parseInt(st.nextToken());
            arr[1]=Integer.parseInt(st.nextToken());
            arr[2]=Integer.parseInt(st.nextToken());
            Arrays.sort(arr);
            if(arr[0]==arr[1]&&arr[1]==arr[2])
                sum=10000+arr[0]*1000;
            else if(arr[0]==arr[1]||arr[1]==arr[2])
                sum=1000+arr[1]*100;
            else sum=arr[2]*100;
            if(max<sum)
                max=sum;
        }
        sb.append(max);
        System.out.println(sb);
    }
}
