
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int T;
    static String str;
    static char[]ch;
    public static void main(String[]args)throws IOException{
        input();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++) {
            str = br.readLine();
            ch = str.toCharArray();
            logic();
        }
        System.out.println(sb);
    }
    static void logic(){
        sb.append(ch[0]).append(ch[str.length()-1]).append('\n');
    }
}
