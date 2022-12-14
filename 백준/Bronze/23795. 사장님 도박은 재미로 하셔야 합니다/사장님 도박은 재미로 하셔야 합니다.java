import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        int sum=0;
        while(N!=-1){
            sum+=N;
            N=Integer.parseInt(br.readLine());
        }
        sb.append(sum);
        System.out.println(sb);
    }
}
