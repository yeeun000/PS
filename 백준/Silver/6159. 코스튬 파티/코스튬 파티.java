import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int S=Integer.parseInt(st.nextToken());
        int arr[]=new int [N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int cnt=0;
        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++){
                if(arr[i]+arr[j]<=S)
                    cnt++;
                if(arr[i]+arr[j]>S)
                    break;
            }
            if(i!=N-2 && arr[i]+arr[i+1]>S)
                break;
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}
