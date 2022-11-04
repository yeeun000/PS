import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int sum=0;
        int a=Integer.parseInt(br.readLine());
        for(int i=0;i<9;i++){
            sum+=Integer.parseInt(br.readLine());
        }
        int x=a-sum;
        sb.append(x);
        System.out.println(sb);
    }
}
