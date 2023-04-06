import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        char ch[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(ch[i]=='A')
                sb.append("X");
            else if(ch[i]=='B')
                sb.append("Y");
            else if(ch[i]=='C')
                sb.append("Z");
            else sb.append((char)(ch[i]-3));
        }
        System.out.println(sb);
    }
}
