import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            int d=Integer.parseInt(st.nextToken());
            int k=Integer.parseInt(st.nextToken());
            int []arr=new int [d];
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<d;j++){
                arr[j]=Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            sb.append(arr[k-1]).append("\n");
        }
        System.out.println(sb);
    }
}
