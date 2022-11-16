import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        long N=Long.parseLong(st.nextToken());
        long M=Long.parseLong(st.nextToken());
        if(N==M)
            sb.append("1");
        else sb.append("0");
        System.out.println(sb);
    }
}