import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        long a=1;
        long b=1;
        long c=0;
        for(int i=2;i<N;i++){
            c=a+b;
            a=b;
            b=c;
        }
        if(N==1)
            sb.append("1");
        else if(N==2)
            sb.append("1");
        else sb.append(c);
        System.out.println(sb);
    }
}
