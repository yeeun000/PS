import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int cnt=0;
        int sum=0;
        int max=0;
        for(int i=0;i<5;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<4;j++){
                sum+=Integer.parseInt(st.nextToken());
            }
            if(sum>max) {
                max = sum;
                cnt=i+1;
            }
            sum=0;
        }
        sb.append(cnt+" "+max);
        System.out.println(sb);
    }
}
