import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        if(a==b) {
            if(a==0 && b==0)
                sb.append("Not a moose");
                else
                    sb.append("Even ").append(a * 2);
        }
        else{
            if(a>b)
                sb.append("Odd ").append(a*2);
            else sb.append("Odd ").append(b*2);
        }
        System.out.println(sb);
    }
}
