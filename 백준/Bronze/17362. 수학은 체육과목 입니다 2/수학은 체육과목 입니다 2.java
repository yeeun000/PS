import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        int a=N%8;
        if(a==0 || a==2)
            sb.append("2");
        else if(a==1)
            sb.append("1");
        else if(a==3||a==7)
            sb.append("3");
        else if(a==4 || a==6)
            sb.append("4");
        else sb.append("5");
        System.out.println(sb);
    }
}
