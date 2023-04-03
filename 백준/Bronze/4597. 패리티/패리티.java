import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        while(!str.equals("#")) {
            char ch[]=str.toCharArray();
            int cnt=0;
            for(int i=0;i<str.length()-1;i++){
                if(ch[i]=='1')
                    cnt++;
                sb.append(ch[i]);
            }
            if(cnt%2==0){
                if(ch[str.length()-1]=='e')
                    sb.append("0");
                else sb.append("1");
            }
            else{
                if(ch[str.length()-1]=='e')
                    sb.append("1");
                else sb.append("0");
            }
            sb.append("\n");
            str=br.readLine();
        }
        System.out.println(sb);
    }
}
