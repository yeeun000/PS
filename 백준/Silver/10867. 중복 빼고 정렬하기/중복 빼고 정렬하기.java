import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        sb.append(arr[0]).append(" ");
        for(int i=1;i<N;i++){
            if(arr[i-1]!=arr[i]){
                sb.append(arr[i]).append(" ");
            }
        }
        System.out.println(sb);
    }
}