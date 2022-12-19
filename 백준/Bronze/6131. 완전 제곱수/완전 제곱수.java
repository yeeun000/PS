import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        int cnt=0;
        for(int i=1;i<501;i++){
            for(int j=i;j<501;j++){
                if((j*j)-(i*i)==N)
                    cnt++;
            }
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}
