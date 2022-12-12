import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int h=Integer.parseInt(st.nextToken());
        int v=Integer.parseInt(st.nextToken());
        int re_h=0;
        int re_v=0;
        if(h>N-h)
            re_h=h;
        else re_h=N-h;
        if(v>N-v)
            re_v=v;
        else
            re_v=N-v;
        sb.append(4*re_h*re_v);
        System.out.println(sb);
    }
}
