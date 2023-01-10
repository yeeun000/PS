import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        int sum=0;
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            sum+=b%a;
        }
        sb.append(sum);
        System.out.println(sb);
    }
}
