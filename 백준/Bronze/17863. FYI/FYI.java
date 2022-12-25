import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        char ch[]=str.toCharArray();
        if(ch[0]=='5'&& ch[1]=='5' && ch[2]=='5')
            sb.append("YES");
        else sb.append("NO");
        System.out.println(sb);
    }
}
