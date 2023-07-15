import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String a=br.readLine();
        String b=br.readLine();
        int i=0;
        while(!(a.equals("END") && b.equals("END"))){
            i++;
            char ch[]=a.toCharArray();
            char c[]=b.toCharArray();
            Arrays.sort(ch);
            Arrays.sort(c);
            a=new String(ch);
            b=new String(c);
            sb.append("Case "+i+": ");
            if(a.equals(b))
                sb.append("same");
            else sb.append("different");
            sb.append("\n");
            a=br.readLine();
            b=br.readLine();
        }
        System.out.println(sb);
    }
}
