import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        while(!str.equals("***")){
            char ch[]=str.toCharArray();
            for(int i=str.length()-1;i>=0;i--){
             sb.append(ch[i]);
            }
            sb.append("\n");
            str=br.readLine();
        }
        System.out.println(sb);
    }
}
