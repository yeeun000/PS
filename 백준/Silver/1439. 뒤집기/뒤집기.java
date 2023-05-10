import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        StringTokenizer cnt_0 = new StringTokenizer(str, "0");
        StringTokenizer cnt_1 = new StringTokenizer(str, "1");
        if(cnt_0.countTokens()<cnt_1.countTokens())
            sb.append(cnt_0.countTokens());
        else sb.append(cnt_1.countTokens());
        System.out.println(sb);
    }
}
