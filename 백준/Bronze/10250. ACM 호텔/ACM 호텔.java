import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            st=new StringTokenizer(br.readLine());
            int H=Integer.parseInt(st.nextToken());
            int W=Integer.parseInt(st.nextToken());
            int N=Integer.parseInt(st.nextToken());
            int a=0;
            int b=0;
            if(N%H==0) {
                b = H;
                a=N/H;
            }
            else {
                b=N%H;
                a=N/H+1;
            }
            if(a<10)
                b=b*10;
            String sum=Integer.toString(b)+Integer.toString(a);
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}