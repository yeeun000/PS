import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int M=Integer.parseInt(br.readLine());
        int N=Integer.parseInt(br.readLine());
        int sum=0;
        int i=1;
        int min=0;
        while(true){
            int s=i*i;
            if(s>N)
                break;
            if(M<=s && N>=s) {
                if(sum==0)
                    min=s;
                sum += s;
            }
            i++;
        }
        if(sum!=0)
        sb.append(sum).append("\n").append(min);
        else sb.append("-1");
        System.out.println(sb);
    }
}
