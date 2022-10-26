import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int a,b,c;
    public static void main(String[]args)throws IOException{
        input();
        logic();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        c=Integer.parseInt(br.readLine());
    }
    static void logic(){
        int sum=9*1+7*3+8*1+0*3+9*1+2*3+1*1+4*3+1*1+8*3;
        sum+=a*1+b*3+c*1;
        sb.append(sum);
        System.out.println("The 1-3-sum is "+sb);
    }
}
