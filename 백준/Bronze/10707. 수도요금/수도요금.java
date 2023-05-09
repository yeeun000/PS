import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
            int x=Integer.parseInt(br.readLine());
            int b=Integer.parseInt(br.readLine());
            int c=Integer.parseInt(br.readLine());
            int d=Integer.parseInt(br.readLine());
            int s=Integer.parseInt(br.readLine());
            int sum=0;
            if(c<s){
                sum=s-c;
                sum=sum*d+b;
                if(sum<x*s)
                    sb.append(sum);
                else sb.append(x*s);
            }
            else{
                if(b<x*s)
                    sb.append(b);
                else sb.append(x*s);
            }
            System.out.println(sb);
    }
}
