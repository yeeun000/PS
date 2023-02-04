import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        int cnt_a=0;
        int cnt_b=0;
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            if(a<b)
                cnt_b++;
            else if(a>b)
                cnt_a++;
        }
        sb.append(cnt_a).append(" ").append(cnt_b);
        System.out.println(sb);
    }
}
