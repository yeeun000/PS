import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int t=Integer.parseInt(st.nextToken());
        int s=Integer.parseInt(st.nextToken());
        if(t>11&&t<=16&&s==0)
            sb.append("320");
        else sb.append("280");
        System.out.println(sb);
    }
}
