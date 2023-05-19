import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        int arr[]=new int [N];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int cnt=0;
        int x=0;
        while(true){
            if(cnt==N){
                x=1;
                break;
            }
            if(arr[cnt]!=cnt+1){
                sb.append(cnt+1);
                break;
            }
            cnt++;
        }
        if(x==1)
            sb.append(cnt+1);
        System.out.println(sb);
    }
}
