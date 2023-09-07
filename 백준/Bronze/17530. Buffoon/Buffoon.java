import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        int a=Integer.parseInt(br.readLine());
        int max=0;
        for(int i=1;i<N;i++){
            int b=Integer.parseInt(br.readLine());
            if(max<b){
                max=b;
            }
        }
        if(max<=a)
            sb.append("S");
        else sb.append("N");
        System.out.println(sb);
    }
}
