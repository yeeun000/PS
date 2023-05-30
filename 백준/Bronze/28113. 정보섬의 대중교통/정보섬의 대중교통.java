import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        if(N<b || N==b){
            if(a<b)
                sb.append("Bus");
            else if(a>b)sb.append("Subway");
            else sb.append("Anything");
        }
        else sb.append("Subway");
        System.out.println(sb);
    }
}
