import java.io.*;
public class Main {
    static BufferedReader br;
    static int N;
    public static void main(String[]args)throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());
        for(int s=0;s<N;s++) {
            for (int j = 0; j < s; j++) {
                System.out.print(" ");
            }
            for (int i = N; i > s; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
