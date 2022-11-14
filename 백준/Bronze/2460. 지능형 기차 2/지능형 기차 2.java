import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int A,B;
    public static void main(String[]args)throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        int sum=0;
        int max=0;
        for(int i=0;i<10;i++){
            st=new StringTokenizer(br.readLine());
            A=Integer.parseInt(st.nextToken());
            B=Integer.parseInt(st.nextToken());
            sum-=A;
            sum+=B;
            if(sum>max)
                max=sum;
        }
        sb.append(max);
        System.out.println(sb);
    }
}