import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine(),"-");
        while(st.hasMoreTokens()){
            String str=st.nextToken();
            char []ch=str.toCharArray();
            sb.append(ch[0]);
        }
        System.out.println(sb);
    }
}
