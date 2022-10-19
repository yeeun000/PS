
import java.io.*;
public class Main {
    static BufferedReader br;
    static int N;
    public static void main(String[]args)throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());
        for(int i=N;i>0;i--){
            for(int j=i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int s=(2*N)-(2*i-1);s>0;s--){
                System.out.print("*");
            }
             System.out.println();
        }
    }
}
