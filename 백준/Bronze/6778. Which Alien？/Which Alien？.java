import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int A=Integer.parseInt(br.readLine());
        int B=Integer.parseInt(br.readLine());
        int i=0;
        if(A>2&&B<5) {
            i++;
            sb.append("TroyMartian").append("\n");
        }
        if(A<7&&B>1) {
            i++;
            sb.append("VladSaturnian").append("\n");
        }
        if(A<3&&B<4) {
            i++;
            sb.append("GraemeMercurian").append("\n");
        }
        System.out.println(sb);
    }
}