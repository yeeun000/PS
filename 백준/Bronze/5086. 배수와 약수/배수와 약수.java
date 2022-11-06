import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int A,B;
    public static void main(String[]args)throws IOException{
        input();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        st=new StringTokenizer(br.readLine());
        A=Integer.parseInt(st.nextToken());
        B=Integer.parseInt(st.nextToken());
        while(A!=0&&B!=0){
            if(A>B){
                if(A%B==0)
                    sb.append("multiple").append("\n");
                else sb.append("neither").append("\n");
            }
            else{
                if(B%A==0)
                    sb.append("factor").append("\n");
                else sb.append("neither").append("\n");
            }
            st=new StringTokenizer(br.readLine());
            A=Integer.parseInt(st.nextToken());
            B=Integer.parseInt(st.nextToken());
        }
        System.out.println(sb);
    }
}
