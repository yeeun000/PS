import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        int i=0;
        int s=2;
        while(s<=N){
            s+=6*i;
            i++;
        }
        if(N==1)
            sb.append("1");
        else
        sb.append(i);
        System.out.println(sb);
    }
}
