import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int N=Integer.parseInt(br.readLine());
            String str="";
            int max=0;
            for(int j=0;j<N;j++){
                st=new StringTokenizer(br.readLine());
                String s=st.nextToken();
                int a=Integer.parseInt(st.nextToken());
                if(a>max) {
                    str = s;
                    max=a;
                }
            }
            sb.append(str).append("\n");
        }
        System.out.println(sb);
    }
}
