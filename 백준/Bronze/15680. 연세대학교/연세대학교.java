
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    public static void main(String[]args)throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        if(N==0)
            sb.append("YONSEI");
        else sb.append("Leading the Way to the Future");
        System.out.println(sb);
    }
}
