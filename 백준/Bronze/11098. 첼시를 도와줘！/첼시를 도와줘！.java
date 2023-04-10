import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            int p=Integer.parseInt(br.readLine());
            int cnt=0;
            String str="";
            for(int j=0;j<p;j++){
                st=new StringTokenizer(br.readLine());
                int x=Integer.parseInt(st.nextToken());
                String s=st.nextToken();
                if(x>cnt){
                    cnt=x;
                    str=s;
                }
            }
            sb.append(str).append("\n");
        }
        System.out.println(sb);
    }
}
