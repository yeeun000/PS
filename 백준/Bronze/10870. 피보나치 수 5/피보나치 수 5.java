import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        int a=0;
        int b=1;
        int c=1;
        if(N==0)
            sb.append("0");
        else if(N==1)
            sb.append("1");
        else{
            for(int i=1;i<N;i++){
                c=a+b;
                a=b;
                b=c;
            }
            sb.append(c);
        }
        System.out.println(sb);
    }
}
