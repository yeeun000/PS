import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            int x=Integer.parseInt(br.readLine());
            sb.append(x).append(" ").append(x);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
