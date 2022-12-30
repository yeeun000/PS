import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        String str=br.readLine();
        char ch[]=str.toCharArray();
        int s_cnt=0;
        int b_cnt=0;
        for(int i=0;i<str.length();i++){
            if(ch[i]=='s'){
                s_cnt++;
                i=i+7;
            }
            else{
                b_cnt++;
                i=i+6;
            }
        }
        if(s_cnt<b_cnt)
            sb.append("bigdata?");
        else if(s_cnt==b_cnt)
            sb.append("bigdata? security!");
        else sb.append("security!");
        System.out.println(sb);
    }
}
