import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        while(!str.equals("TTYL")){
            if(str.equals("CU"))
                sb.append("see you").append("\n");
            else if(str.equals(":-)"))
                sb.append("I’m happy").append("\n");
            else if(str.equals(":-("))
                sb.append("I’m unhappy").append("\n");
            else if(str.equals(";-)"))
                sb.append("wink").append("\n");
            else if(str.equals(":-P"))
                sb.append("stick out my tongue").append("\n");
            else if(str.equals("(~.~)"))
                sb.append("sleepy").append("\n");
            else if(str.equals("TA"))
                sb.append("totally awesome").append("\n");
            else if(str.equals("CCC"))
                sb.append("Canadian Computing Competition").append("\n");
            else if(str.equals("CUZ"))
                sb.append("because").append("\n");
            else if(str.equals("TY"))
                sb.append("thank-you").append("\n");
            else if(str.equals("YW"))
                sb.append("you’re welcome").append("\n");
            else sb.append(str).append("\n");
            str=br.readLine();
        }
        sb.append("talk to you later").append("\n");
        System.out.println(sb);
    }
}
