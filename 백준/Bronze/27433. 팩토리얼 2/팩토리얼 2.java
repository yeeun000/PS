import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        long sum=1;
        for(int i=N;i>0;i--){
            sum*=i;
        }
        sb.append(sum);
        System.out.println(sb);
    }
}
