import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        while(true){
            st=new StringTokenizer(br.readLine());
            double a=Double.parseDouble(st.nextToken());
            double b=Double.parseDouble(st.nextToken());
            if(a==0){
                if(b==0)
                    break;
            }
            if(a>0 && b>0) {
                sb.append("Q1");
            }
            else if(a<0 && b>0)
                sb.append("Q2");
            else if(a<0 && b<0)
                sb.append("Q3");
            else if(a>0 && b<0)
                sb.append("Q4");
            else sb.append("AXIS");
            sb.append("\n");
        }
        sb.append("AXIS");
        System.out.println(sb);
    }
}
