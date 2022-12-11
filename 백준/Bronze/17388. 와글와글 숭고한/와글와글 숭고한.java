import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int s=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int h=Integer.parseInt(st.nextToken());
        int sum=s+k+h;
        if(sum>=100)
            sb.append("OK");
        else{
            if(s<k&&s<h)
                sb.append("Soongsil");
            else if(k<s&&k<h)
                sb.append("Korea");
            else sb.append("Hanyang");
        }
        System.out.println(sb);
    }
}
