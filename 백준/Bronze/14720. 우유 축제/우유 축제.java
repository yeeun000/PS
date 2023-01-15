import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int cnt=0;
        int next=0;
        for(int i=0;i<N;i++){
            int x=Integer.parseInt(st.nextToken());
            if(next==x) {
                cnt++;
                next++;
            }
            if(next==3)
                next=0;
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}
