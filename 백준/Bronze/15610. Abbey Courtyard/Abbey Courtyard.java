import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double N=Double.parseDouble(br.readLine());
        double n=Math.sqrt(N)*4;
        System.out.printf("%.7f", n);
    }
}
