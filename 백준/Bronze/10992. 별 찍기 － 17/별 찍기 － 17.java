import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N-1;i++){
            for(int j=0;j<(2*N-1);j++){
                if(j==N-i-1){
                    System.out.print("*");
                    if(i==0)
                        break;
                }
                else if(j==N+i-1) {
                    System.out.print("*");
                    break;
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
        for(int j=0;j<(2*N-1);j++){
            System.out.print("*");
        }
    }
}
