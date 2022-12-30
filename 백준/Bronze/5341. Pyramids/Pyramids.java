import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        while(N!=0){
            sb.append(N*(N+1)/2).append("\n");
            N=Integer.parseInt(br.readLine());
        }
        System.out.println(sb);
    }
}
