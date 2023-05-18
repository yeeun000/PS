import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        int cnt=1;
        while(N!=0){
            String arr[]=new String[N];
            for(int i=0;i<N;i++){
                arr[i]=br.readLine();
            }
            Arrays.sort(arr);
            sb.append(cnt).append("\n");
            for(int i=0;i<N;i++){
                sb.append(arr[i]).append(" ").append("\n");
            }
            N=Integer.parseInt(br.readLine());
            cnt++;
        }
        System.out.println(sb);
    }
}
