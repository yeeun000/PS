import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        long sum=0;
        StringTokenizer st=new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            sum+=Long.parseLong(st.nextToken());
        }
        sb.append(sum);
        System.out.println(sb);
;    }
}
