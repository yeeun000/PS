
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int N;
    public static void main(String[]args)throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        N=Integer.parseInt(br.readLine());
        for(int i=N;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
