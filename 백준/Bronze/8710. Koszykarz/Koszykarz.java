import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int k=Integer.parseInt(st.nextToken());
        int w=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int s=(w-k)/m;
        if((w-k)%m!=0)
            s=s+1;
        sb.append(s);
        System.out.println(sb);
    }
}
