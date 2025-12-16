
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(br.readLine());
        int ok=0;
        int s=Integer.parseInt(br.readLine());
        while(s !=0){
            ok=s%n;
            sb.append(s).append(" is ");
            if(ok==0){
                sb.append("a multiple of ");
            }
            else{
                sb.append("NOT a multiple of ");
            }
            sb.append(n).append(".\n");
            s=Integer.parseInt(br.readLine());
        }
        System.out.println(sb);

    }
}
