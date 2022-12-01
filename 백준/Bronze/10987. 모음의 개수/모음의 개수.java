import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        char []ch=str.toCharArray();
        int cnt=0;
        for(int i=0;i<str.length();i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
                cnt++;
        }
        sb.append(cnt);
        System.out.println(cnt);
    }
}
