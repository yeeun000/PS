import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int N=Integer.parseInt(br.readLine());
            st=new StringTokenizer(br.readLine());
            int sum=0;
            for(int j=0;j<N;j++){
                sum+=Integer.parseInt(st.nextToken());
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
