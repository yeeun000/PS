

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[]args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        BigInteger a=new BigInteger(br.readLine());
        BigInteger b=new BigInteger(br.readLine());
        BigInteger c=new BigInteger(br.readLine());
        BigInteger x;
        x=b.subtract(c);
        x=x.divide(a);
        sb.append(x);
        System.out.println(sb);
    }
}
