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
            String a=st.nextToken();
            String b=st.nextToken();
            if(a.equals(b))
                sb.append("OK").append("\n");
            else sb.append("ERROR").append("\n");
        }
        System.out.println(sb);
    }
}
