import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        char []ch=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(ch[i]!=' ') {
                if((ch[i]<=90 && ch[i]>=65) ) {
                    ch[i] = (char) (ch[i] + 13);
                    if(ch[i]>90){
                        ch[i]=(char)(ch[i]-26);
                    }
                }else if((ch[i]>=97&&ch[i]<=122)){
                    ch[i] = (char) (ch[i] + 13);
                    if(ch[i]>122){
                        ch[i]=(char)(ch[i]-26);
                    }
                }
            }
            sb.append(ch[i]);
        }
        System.out.println(sb);
    }
}