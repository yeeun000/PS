
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N;
    static String str;
    static char [] ch;
    public static void main(String[]args) throws IOException{
        input();
    }
    static void input() throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());
        sb=new StringBuilder();
        for(int i=0;i<N;i++){
            str=br.readLine();
            ch=str.toCharArray();
            logic();
        }
        System.out.println(sb);
    }
    static void logic(){
        int j=0;
        int Cnt=0;
        for(int i=0;i<str.length();i++){
            if(ch[i]=='O'){
                j++;
            }
            else{
                j=0;
            }
            Cnt+=j;
        }
        sb.append(Cnt).append('\n');
    }
}
