import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        long N=Long.parseLong(br.readLine());
        sb.append(N*4);
        System.out.println(sb);
    }
}
