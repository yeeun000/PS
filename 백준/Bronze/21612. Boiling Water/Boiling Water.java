import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        int s=5*N-400;
        sb.append(s).append("\n");
        if(s>N)
            sb.append("-1");
        else if(s==N)
            sb.append("0");
        else sb.append("1");
        System.out.println(sb);
    }
}
