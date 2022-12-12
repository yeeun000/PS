import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        String str=st.nextToken();
        char ch[]=str.toCharArray();
        String s=st.nextToken();
        char c[]=s.toCharArray();
        char re[]=new char [str.length()];
        char r[]=new char [s.length()];
        for(int i=0;i<str.length();i++){
            re[i]=ch[str.length()-1-i];
        }
        for(int i=0;i<s.length();i++){
            r[i]=c[s.length()-1-i];
        }
        str=new String(re);
        s=new String(r);
        int N=Integer.parseInt(str)+Integer.parseInt(s);
        str=String.valueOf(N);
        char q[]=str.toCharArray();
        int cnt=0;
        for(int i=0;i<str.length();i++){
            if(q[str.length()-1-i]=='0'&&cnt==0)
                continue;
            else{
                cnt++;
                sb.append(q[str.length()-1-i]);
            }
        }
        System.out.println(sb);
    }
}
