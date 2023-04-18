import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        char ch[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(ch[i]=='a')
                sb.append("4");
            else if(ch[i]=='e')
                sb.append("3");
            else if(ch[i]=='i')
                sb.append("1");
            else if(ch[i]=='o')
                sb.append("0");
            else if(ch[i]=='s')
                sb.append("5");
            else sb.append(ch[i]);
        }
        System.out.println(sb);
    }
}
