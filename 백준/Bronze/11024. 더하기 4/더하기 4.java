import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++) {
            long sum=0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                sum += Long.parseLong(st.nextToken());
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
        ;    }
}
