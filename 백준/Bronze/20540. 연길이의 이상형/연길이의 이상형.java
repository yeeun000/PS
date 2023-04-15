import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        char ch[]=str.toCharArray();
        if(ch[0]=='E')
            sb.append("I");
        else sb.append("E");
        if(ch[1]=='S')
            sb.append("N");
        else sb.append("S");
        if(ch[2]=='T')
            sb.append("F");
        else sb.append("T");
        if(ch[3]=='J')
            sb.append("P");
        else sb.append("J");
        System.out.println(sb);
    }
}
