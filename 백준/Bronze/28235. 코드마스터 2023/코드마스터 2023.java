import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        if(str.equals("SONGDO"))
            sb.append("HIGHSCHOOL");
        else if(str.equals("CODE"))
            sb.append("MASTER");
        else if(str.equals("2023"))
            sb.append("0611");
        else sb.append("CONTEST");
        System.out.println(sb);
    }
}
