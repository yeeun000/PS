import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int i=1;
        int cnt=0;
        while(i<=N){
            if(Integer.parseInt(st.nextToken())!=i)
                cnt++;
            i++;
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}
