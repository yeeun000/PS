import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        int n=str.length();
        String s[]=new String [n];
        for(int i=0;i<n;i++){
            s[i]=str;
            char[]ch=str.toCharArray();
            char[]c=new char[str.length()-1];
            for(int j=0;j<str.length()-1;j++){
                c[j]=ch[j+1];
            }
            str=new String(c);
        }
        Arrays.sort(s);
        for(int i=0;i<n;i++){
            sb.append(s[i]).append("\n");
        }
        System.out.println(sb);
    }
}
