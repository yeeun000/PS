import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        double A=Double.parseDouble(st.nextToken());
        double B=Double.parseDouble(st.nextToken());
        double C=Double.parseDouble(st.nextToken());
        int x = (int)((A * B) / C);
        int y = (int)((A / B) * C);
        if(x>y)
            sb.append(x);
        else sb.append(y);
        System.out.println(sb);
    }
}
