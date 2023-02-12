import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        char ch[]=str.toCharArray();
        int sum_a=0;
        int sum_b=0;
        for(int i=0;i<str.length()/2;i++){
            sum_a+=ch[i]-'0';
        }
        for(int i=str.length()/2;i<str.length();i++){
            sum_b+=ch[i]-'0';
        }
        if(sum_a==sum_b)
            sb.append("LUCKY");
        else sb.append("READY");
        System.out.println(sb);
    }
}
