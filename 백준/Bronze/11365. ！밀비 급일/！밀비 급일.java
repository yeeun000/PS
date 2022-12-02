import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        while(!str.equals("END")){
            char []ch=str.toCharArray();
            for(int i=0;i<str.length();i++){
                sb.append(ch[str.length()-1-i]);
            }
            sb.append("\n");
            str=br.readLine();
        }
        System.out.println(sb);
    }
}
