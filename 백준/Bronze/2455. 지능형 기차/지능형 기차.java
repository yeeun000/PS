import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int arr[]=new int[4];
        int sum=0;
        for(int i=0;i<4;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            sum-=a;
            sum+=b;
            arr[i]=sum;
        }
        Arrays.sort(arr);
        sb.append(arr[3]);
        System.out.println(sb);
    }
}
