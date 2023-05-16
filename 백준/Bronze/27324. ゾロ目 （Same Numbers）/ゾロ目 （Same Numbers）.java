import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        char ch[]=str.toCharArray();
        if(ch[0]==ch[1])
            sb.append("1");
        else sb.append("0");
        System.out.println(sb);

    }
}
