
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static Queue<Integer> q;
    static int N;
    public static void main(String[]args)throws IOException{
        input();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        q=new LinkedList<>();
        String str;
        N=Integer.parseInt(br.readLine());
        int x=0;
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            str=st.nextToken();

            if(str.equals("push")){
                x=Integer.parseInt(st.nextToken());
                q.add(x);
            }
            else if(str.equals("pop")){
                if(q.size()==0)
                    sb.append("-1").append('\n');
                else sb.append(q.poll()).append('\n');
            }
            else if(str.equals("size")){
                sb.append(q.size()).append('\n');
            }
            else if(str.equals("empty")){
                if(q.size()==0)
                    sb.append("1").append('\n');
                else sb.append("0").append('\n');
            }
            else if(str.equals("front")){
                if(q.size()==0)
                    sb.append("-1").append('\n');
                else sb.append(q.peek()).append('\n');
            }
            else {
                if(q.size()==0)
                    sb.append("-1").append('\n');
                else sb.append(x).append('\n');
            }
        }
        System.out.println(sb);
    }
}
