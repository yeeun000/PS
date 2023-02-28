import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        int len=str.length();
        char ch[]=str.toCharArray();
        int cnt=0;
        for(int i=6;i<len-1;i++){
            if(ch[i]=='_')
                cnt++;
        }
        int sum=len+2+cnt*5;
        sb.append(sum);
        System.out.println(sb);
    }
}
