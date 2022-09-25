
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static char[]ch;
    static String str;
    public static void main(String[]args)throws IOException{
        input();
        logic();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
       // str=br.readLine();
        st=new StringTokenizer(br.readLine());
        sb=new StringBuilder();
//        ch=str.toCharArray();
//        System.out.println(str);
    }
    static void logic(){
        int C=st.countTokens();
       // int i=0;
//        for(int j=0;j<str.length();j++){
//            if(ch[i]!=32){
//
//            }
//        }
        sb.append(C);
        System.out.println(sb);
    }
}
