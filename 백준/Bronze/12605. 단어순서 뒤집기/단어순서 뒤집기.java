import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            Stack<String>s=new Stack<>();
            while(st.hasMoreTokens()){
                s.push(st.nextToken());
            }
            sb.append("Case #").append(i+1).append(": ");
            while(!s.empty()){
                sb.append(s.pop()).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
