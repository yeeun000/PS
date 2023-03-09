package PS;
import java.io.*;
public class Boj17350 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        int s=0;
        for(int i=0;i<N;i++){
            String str=br.readLine();
            if(str.equals("anj")) {
                s++;
                break;
            }
        }
        if(s==0)
            sb.append("뭐야?");
        else sb.append("뭐야;");
        System.out.println(sb);
    }
}
