import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int s=N*100;
        if(s<M)
            sb.append("No");
        else sb.append("Yes");
        System.out.println(sb);
    }
}
