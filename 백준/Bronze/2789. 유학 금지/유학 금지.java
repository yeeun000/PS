
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        char ch[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(ch[i]=='C' ||ch[i]=='A' ||ch[i]=='M' ||ch[i]=='B' ||ch[i]=='R' ||ch[i]=='I' ||ch[i]=='D' ||ch[i]=='G' ||ch[i]=='E')
                continue;
            else sb.append(ch[i]);
        }
        System.out.println(sb);
    }
}
