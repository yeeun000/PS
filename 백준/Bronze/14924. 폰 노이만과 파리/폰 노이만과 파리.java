import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int s=Integer.parseInt(st.nextToken());
        int t=Integer.parseInt(st.nextToken());
        int d=Integer.parseInt(st.nextToken());
        int sum=d/(s*2)*t;
        sb.append(sum);
        System.out.println(sb);
    }
}
