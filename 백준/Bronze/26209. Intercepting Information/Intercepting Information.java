import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int cnt=0;
        for(int i=0;i<8;i++){
            int x=Integer.parseInt(st.nextToken());
            if(x==9){
                cnt++;
                break;
            }
        }
        if(cnt==0)
            sb.append("S");
        else sb.append("F");
        System.out.println(sb);
    }
}
