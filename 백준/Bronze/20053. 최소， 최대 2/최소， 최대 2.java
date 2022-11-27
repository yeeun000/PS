import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            int T=Integer.parseInt(br.readLine());
            st=new StringTokenizer(br.readLine());
            int []arr=new int [T];
            for(int j=0;j<T;j++){
             arr[j]=Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            sb.append(arr[0]+" "+arr[T-1]).append("\n");
        }
        System.out.println(sb);
    }
}
