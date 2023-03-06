package PS;
import java.io.*;
import java.util.*;
public class Boj25206 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        double sum=0;
        double q=0;
        for(int i=0;i<20;i++){
            st=new StringTokenizer(br.readLine());
            String str=st.nextToken();
            double a=Double.parseDouble(st.nextToken());
            String s=st.nextToken();
            q+=a;
            double b;
            if(s.equals("P")){
                q-=a;
                continue;
            }
            if(s.equals("A+"))
                b=4.5;
            else if(s.equals("A0"))
                b=4.0;
            else if(s.equals("B+"))
                b=3.5;
            else if(s.equals("B0"))
                b=3.0;
            else if(s.equals("C+"))
                b=2.5;
            else if(s.equals("C0"))
                b=2.0;
            else if(s.equals("D+"))
                b=1.5;
            else if(s.equals("D0"))
                b=1.0;
            else b=0.0;
            sum+=(a*b);
        }
        sb.append(sum/q);
        System.out.println(sb);
    }
}
