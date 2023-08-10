import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        int cnt=0;
        while(!str.equals(".")){
            Stack <Character> s=new Stack<>();
            char ch[]=str.toCharArray();
            for(int i=0;i<str.length();i++){
                if(ch[i]=='[') {
                    s.push(ch[i]);
                }
                else if(ch[i]=='(') {
                    s.push(ch[i]);
                }
                else if(ch[i]==']') {
                    if(s.empty()){
                        cnt++;
                        break;
                    }
                    if(s.peek()=='[')
                        s.pop();
                    else{
                        cnt++;
                        break;
                    }
                }
                else if(ch[i]==')') {
                    if(s.empty()){
                        cnt++;
                        break;
                    }
                    if(s.peek()=='(')
                        s.pop();
                    else{
                        cnt++;
                        break;
                    }
                }
                if(cnt>0){
                    break;
                }
            }
            if(cnt==0 && s.size()==0)
                sb.append("yes").append("\n");
            else sb.append("no").append("\n");
            cnt=0;
            str=br.readLine();
        }
        System.out.println(sb);
    }
}
