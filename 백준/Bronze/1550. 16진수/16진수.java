import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        char ch[]=str.toCharArray();
        int sum=0;
        int x=0;
        for(int i=str.length()-1;i>=0;i--){
            if(ch[i]=='A')
                x=10;
            else if(ch[i]=='B')
                x=11;
            else if(ch[i]=='C')
                x=12;
            else if(ch[i]=='D')
                x=13;
            else if(ch[i]=='E')
                x=14;
            else if(ch[i]=='F')
                x=15;
            else x=ch[i]-'0';
            for(int j=str.length()-i-1;j>0;j--){
                x=x*16;
            }
            sum+=x;
        }
        sb.append(sum);
        System.out.println(sb);
    }
}
