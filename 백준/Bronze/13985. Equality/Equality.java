import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        char ch[]=str.toCharArray();
        int a=ch[0]-'0';
        int b=ch[4]-'0';
        int c=ch[8]-'0';
        if(a+b==c)
            sb.append("YES");
        else sb.append("NO");
        System.out.println(sb);
    }
}
