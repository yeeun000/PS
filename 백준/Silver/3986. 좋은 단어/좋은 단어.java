import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        int cnt=0;
        for(int i=0;i<N;i++) {
            Stack<Character> s=new Stack<>();
            String str = br.readLine();
            char ch[] = str.toCharArray();
            for(int j=0;j<str.length();j++){
                if(j!=0 && !s.empty()) {
                    if(ch[j]==s.peek()) {
                        s.pop();
                        continue;
                    }
                }
                s.push(ch[j]);
            }
            if(s.empty()) {
                cnt++;
            }
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}
