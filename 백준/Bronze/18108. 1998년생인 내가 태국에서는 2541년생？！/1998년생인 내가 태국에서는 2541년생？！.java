
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    public static void main(String[]args)throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        int S=N-543;
        sb.append(S);
        System.out.println(sb);
    }
}
