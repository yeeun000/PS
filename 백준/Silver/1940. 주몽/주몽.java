import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        int M=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int arr[]=new int [N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int start=0;
        int end=N-1;
        int cnt=0;
        while(end>start){
            if(arr[start]+arr[end]>M){
                end--;
            }
            else if(arr[start]+arr[end]<M)
                start++;
            else {
                cnt++;
                start++;
                end--;
            }
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}
