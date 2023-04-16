package PS;
import java.io.*;
public class Boj10480 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            int x=Integer.parseInt(br.readLine());
            sb.append(x).append(" is ");
            if(x%2==0)
                sb.append("even\n");
            else sb.append("odd\n");
        }
        System.out.println(sb);
    }
}
