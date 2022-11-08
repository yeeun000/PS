import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int A=Integer.parseInt(br.readLine());
        int B=Integer.parseInt(br.readLine());
        int C=B-A+B;
        sb.append(C);
        System.out.println(sb);
    }
}