import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int arr[]=new int[N];
        int ar[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            ar[i]=arr[i];
        }
        Arrays.sort(ar);
        for(int i=0;i<N;i++){
            for(int s=0;s<N;s++){
                if(ar[s]==0)
                    continue;
                if(arr[i]==ar[s]) {
                    sb.append(s).append(" ");
                    ar[s]=0;
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
