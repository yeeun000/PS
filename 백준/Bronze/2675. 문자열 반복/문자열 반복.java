
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int T,R;
    static String str;
    static char[] ch;
    public static void main(String[]args) throws IOException{
        input();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        T=Integer.parseInt(br.readLine());
        sb=new StringBuilder();
        for(int i=0;i<T;i++) {
            st = new StringTokenizer(br.readLine());
            R=Integer.parseInt(st.nextToken());
            str=st.nextToken();
            logic();
        }
        System.out.println(sb);
    }
    static void logic(){
        ch=str.toCharArray();
        for(int i=0;i<str.length();i++){
            for(int j=0;j<R;j++){
                sb.append(ch[i]);
            }
        }
        sb.append('\n');
    }
}
