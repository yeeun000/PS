import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    public static void main(String[]args)throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        String str=br.readLine();
        char []ch=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(i!=0 &&i%10==0) {
                sb.append('\n');
                sb.append(ch[i]);
            }
            else sb.append(ch[i]);
        }
        System.out.println(sb);
    }
}