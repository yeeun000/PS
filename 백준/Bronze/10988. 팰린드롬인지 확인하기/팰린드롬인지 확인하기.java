import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        char []ch=str.toCharArray();
        int cnt=0;
        for(int i=0;i<str.length()/2;i++){
            if(ch[i]==ch[str.length()-1-i])
                cnt++;
        }
        if(cnt==str.length()/2)
            sb.append("1");
        else sb.append("0");
        System.out.println(sb);
    }
}
