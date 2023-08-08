import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        Stack <Integer> s=new Stack<>();
        for(int i=0;i<N;i++){
            String str=br.readLine();
            if(str.equals("5")){
                if(s.empty())
                    sb.append("-1");
                else sb.append(s.peek());
                sb.append("\n");
            }
            else if(str.equals("2")){
                if(s.empty()){
                    sb.append("-1");
                }
                else{
                    sb.append(s.peek());
                    s.pop();
                }
                sb.append("\n");
            }
            else if(str.equals("3")) {
                sb.append(s.size());
                sb.append("\n");
            }
            else if(str.equals("4")){
                if(s.empty())
                    sb.append("1");
                else sb.append("0");
                sb.append("\n");
            }
            else{
                st=new StringTokenizer(str);
                String a=st.nextToken();
                int X=Integer.parseInt(st.nextToken());
                s.push(X);
            }
        }
        System.out.println(sb);
    }
}
