
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static String str;
    public static void main(String[]args) throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        str=br.readLine();
        sb.append(str+"??!");
        System.out.println(sb);
    }
}
