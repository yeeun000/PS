import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            int d=Integer.parseInt(br.readLine());
            for(int j=0;j<=d;j++){
                if(j*j+j>d) {
                    sb.append(j-1).append("\n");
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
