import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int A=Integer.parseInt(st.nextToken());
        int l=Integer.parseInt(st.nextToken());
        int sum=A*(l-1)+1;
        sb.append(sum);
        System.out.println(sb);
    }
}
