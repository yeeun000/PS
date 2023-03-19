import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int sum_a=0;
        int sum_b=0;
        for(int i=3;i>0;i--){
            sum_a+=(Integer.parseInt(br.readLine())*i);
        }
        for(int i=3;i>0;i--){
            sum_b+=(Integer.parseInt(br.readLine())*i);
        }
        if(sum_a<sum_b)
            sb.append("B");
        else if(sum_a>sum_b)
            sb.append("A");
        else sb.append("T");
        System.out.println(sb);
    }
}
