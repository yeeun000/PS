import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        double sum=a*2+b*3.141592*2;
        sb.append(sum);
        System.out.println(sb);
    }
}
