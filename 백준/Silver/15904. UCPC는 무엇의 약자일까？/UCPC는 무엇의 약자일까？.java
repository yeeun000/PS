import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        char ch[]=str.toCharArray();
        int cnt=0;
        for(int i=0;i<str.length();i++){
            if(cnt==0){
                if(ch[i]=='U')
                    cnt++;
            }
            else if(cnt==1){
                if(ch[i]=='C')
                    cnt++;
            }
            else if(cnt==2){
                if(ch[i]=='P')
                    cnt++;
            }
            else{
                if(ch[i]=='C') {
                    cnt++;
                    break;
                }
            }
        }
        if(cnt==4)
            sb.append("I love UCPC");
        else sb.append("I hate UCPC");
        System.out.println(sb);
    }
}
