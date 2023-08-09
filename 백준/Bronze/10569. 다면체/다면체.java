import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            int V=Integer.parseInt(st.nextToken());
            int E=Integer.parseInt(st.nextToken());
            int m=2+E-V;
            sb.append(m).append("\n");
        }
        System.out.println(sb);
    }
}
