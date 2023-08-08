import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        Stack<Character> s=new Stack<>();
        char ch[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(ch[i]=='*')
                sb.append(s.size());
            else if(ch[i]=='(')
                s.push(ch[i]);
            else s.pop();
        }
        System.out.println(sb);
    }
}
