import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int sum_W=0;
        int sum_K=0;
        int []W=new int [10];
        int []K=new int [10];
        for(int i=0;i<10;i++){
            W[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<10;i++){
            K[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(W);
        Arrays.sort(K);
        for(int i=7;i<10;i++){
            sum_K+=K[i];
            sum_W+=W[i];
        }
        sb.append(sum_W+" "+sum_K);
        System.out.println(sb);
    }
}
