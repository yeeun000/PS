
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int N;
    static Stack<Integer> stk;
    public static void main(String[]args)throws IOException{
        input();

    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        stk=new Stack<>();
        N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            String str=st.nextToken();
            int s;
            if(str.equals("push")){
                int j=Integer.parseInt(st.nextToken());
                stk.push(j);
            }
            else if(str.equals("top")){
                if(stk.size()==0){
                    sb.append("-1").append('\n');
                }
                else {
                    s=stk.peek();
                    sb.append(s).append('\n');
                }
            }else if(str.equals("size")){
                sb.append(stk.size()).append('\n');
            }else if(str.equals("empty")){
                if(stk.size()==0) {
                    sb.append("1").append('\n');
                }
                else{
                    sb.append("0").append('\n');
                }
            }else if(str.equals("pop")){
                if(stk.size()==0) {
                    sb.append("-1").append('\n');
                }
                else{
                    s=stk.pop();
                    sb.append(s).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}