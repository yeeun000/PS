
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int Sum;
    public static void main(String[]args) throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        for(int i=0;i<5;i++){
            int s=Integer.parseInt(br.readLine());
            Sum+=s;
        }
        sb.append(Sum);
        System.out.println(sb);
    }
}
