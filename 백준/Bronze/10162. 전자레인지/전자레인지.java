import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int T=Integer.parseInt(br.readLine());
        int a=0,b=0,c=0;
        if(300<=T){
            a=T/300;
            T=T%300;
        }
        if(60<=T){
            b=T/60;
            T=T%60;
        }
        if(10<=T){
            c=T/10;
            T=T%10;
        }
        if(T>0)
            sb.append("-1");
        else
        sb.append(a).append(" ").append(b).append(" ").append(c);
        System.out.println(sb);
    }
}
