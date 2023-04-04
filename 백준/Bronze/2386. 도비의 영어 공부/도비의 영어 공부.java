import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        while(!str.equals("#")){
            str=str.toLowerCase();
            char ch[]=str.toCharArray();
            int cnt=0;
            for(int i=2;i<str.length();i++){
                if(ch[0]==(ch[i]))
                    cnt++;
            }
            sb.append(ch[0]).append(" ");
            sb.append(cnt).append("\n");
            str=br.readLine();
        }
        System.out.println(sb);
    }
}
