import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        String name=br.readLine();
        int k=Integer.parseInt(br.readLine());
        if(name.equals("annyong")){
            if(k%2==1){
                sb.append(k);
            }
            else{
                if(k-1!=0)
                    sb.append(k-1);
                else sb.append(k+1);
            }
        }
        else{
            if(k%2==0){
                sb.append(k);
            }
            else{
                if(k-1!=0)
                    sb.append(k-1);
                else sb.append(k+1);
            }
        }
        System.out.println(sb);
    }
}
