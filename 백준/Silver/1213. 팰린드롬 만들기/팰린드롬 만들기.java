import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        char ch[]=str.toCharArray();
        Arrays.sort(ch);
        char c='a';
        int cnt=0;
        int p=0;
        int cnt_cmt=1;
        int odd=0;
        char s[]=new char[str.length()];
        if(str.length()==1) {
            sb.append(str);
        }
        else {
            for (int i = 1; i < str.length(); i++) {
                if (ch[i] == ch[i-1]){
                    cnt_cmt++;
                }
                if(ch[i] != ch[i-1]){
                    if(cnt_cmt%2==1)
                        odd++;
                    cnt_cmt=1;
                }
                else if( i==str.length()-1){
                    if(cnt_cmt%2==1)
                        odd++;
                }
            }
            if(odd>1){
                sb.append("I'm Sorry Hansoo");
            }
            else {
                for (int i = 0; i < str.length() - 1; i++) {
                    if (cnt > 1) {
                        break;
                    }
                    if (ch[i] == ch[i + 1]) {
                        s[p] = ch[i];
                        s[str.length() - 1 - p] = ch[i];
                        p++;
                        i++;
                    } else {
                        c = ch[i];
                        cnt++;
                    }
                }
                if (ch[str.length() - 1] != ch[str.length() - 2] || cnt_cmt%2==1) {
                    c = ch[str.length() - 1];
                    cnt++;
                }
                if (cnt > 1) {
                    sb.append("I'm Sorry Hansoo");
                } else {
                    if (c != 'a') {
                        s[(str.length() / 2)] = c;
                    }
                    for (int i = 0; i < str.length(); i++) {
                        sb.append(s[i]);
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
