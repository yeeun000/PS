import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        char ch[]=str.toCharArray();
        int cnt_a=0;
        int cnt_b=0;
        for(int i=0;i<str.length();i++){
            if(ch[i]=='A')
                cnt_a++;
            else cnt_b++;
        }
        sb.append(cnt_a).append(" : ").append(cnt_b);
        System.out.println(sb);
    }
}
