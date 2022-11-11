import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s=br.readLine();
        while(!s.equals("#")){
            int cnt=0;
            char ch[]=s.toCharArray();
            for(int i=0;i<s.length();i++){
                if(ch[i]=='a'|| ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
                    cnt++;
                else if(ch[i]=='A'|| ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
                    cnt++;
            }
            sb.append(cnt).append("\n");
            s=br.readLine();
        }
        System.out.println(sb);
    }
}
