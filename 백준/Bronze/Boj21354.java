package PS;
import java.io.*;
import java.util.*;
public class Boj21354 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int sum_a=a*7;
        int sum_b=b*13;
        if(sum_a>sum_b)
            sb.append("Axel");
        else if(sum_a<sum_b)
            sb.append("Petra");
        else sb.append("lika");
        System.out.println(sb);
    }
}
