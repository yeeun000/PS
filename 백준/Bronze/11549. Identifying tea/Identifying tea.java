import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int cnt=0;
        for(int i=0;i<5;i++){
            if(Integer.parseInt(st.nextToken())==N)
            cnt++;
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}
