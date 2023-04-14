import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        if(str.equals("NLCS"))
            sb.append("North London Collegiate School");
        else if(str.equals("BHA"))
            sb.append("Branksome Hall Asia");
        else if(str.equals("KIS"))
            sb.append("Korea International School");
        else
            sb.append("St. Johnsbury Academy");
        System.out.println(sb);
    }
}
