import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        int m=1000-N;
        int a=m/500;
        m=m-500*a;
        int b=m/100;
        m=m-100*b;
        int c=m/50;
        m=m-50*c;
        int d=m/10;
        m=m-10*d;
        int e=m/5;
        int f=m%5;
        sb.append(a+b+c+d+e+f);
        System.out.println(sb);
    }
}
