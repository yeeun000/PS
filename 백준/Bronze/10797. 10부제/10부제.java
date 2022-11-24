import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int cnt=0;
        for(int i=0;i<5;i++){
            int a=Integer.parseInt(st.nextToken());
            if(a%10==N)
                cnt++;
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}
