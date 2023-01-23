import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        int a=100;
        int b=100;
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            int c=Integer.parseInt(st.nextToken());
            int d=Integer.parseInt(st.nextToken());
            if(c<d)
                a-=d;
            else if(c==d)
                continue;
            else b-=c;
        }
        sb.append(a).append("\n").append(b);
        System.out.println(sb);
    }
}
