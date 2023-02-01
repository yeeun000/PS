import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            double sum=0;
            double a=Integer.parseInt(st.nextToken())*350.34;
            double b=Integer.parseInt(st.nextToken())*230.90;
            double c=Integer.parseInt(st.nextToken())*190.55;
            double d=Integer.parseInt(st.nextToken())*125.30;
            double e=Integer.parseInt(st.nextToken())*180.90;
            sum=a+b+c+d+e;
            System.out.printf("$%.2f",sum);
            System.out.println();
        }
    }
}
