import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        if(str.contains("D2"))
            sb.append("D2");
        else if(str.contains("d2"))
            sb.append("D2");
        else sb.append("unrated");
        System.out.println(sb);
    }
}
