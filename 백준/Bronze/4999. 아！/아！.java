
import java.util.*;
import java.io.*;
public class Main{
    static BufferedReader br;
    static StringBuilder sb;
    static String str;
    static String str2;
    public static void main(String[]args) throws IOException{
        input();
        logic();
    }
    static void input() throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        str=br.readLine();
        str2=br.readLine();
        sb=new StringBuilder();

    }
    static void logic(){
        if(str.length()<str2.length())
            sb.append("no");
        else sb.append("go");
        System.out.println(sb);
    }
}
