import java.io.*;
import java.math.BigInteger;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        BigInteger a=new BigInteger(br.readLine());
        String str=br.readLine();
        BigInteger b=new BigInteger(br.readLine());
        if(str.equals("*"))
            System.out.println(a.multiply(b));
        else System.out.println(a.add(b));
    }
}
