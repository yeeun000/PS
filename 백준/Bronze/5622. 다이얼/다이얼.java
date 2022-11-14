import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static String str;
    public static void main(String[]args)throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        str=br.readLine();
        logic();
    }
    static void logic(){
        char []ch=str.toCharArray();
        int sum=0;
        for(int i=0;i<str.length();i++){
            if(ch[i]=='A'||ch[i]=='B'||ch[i]=='C')
                sum+=3;
            else if(ch[i]=='D'||ch[i]=='E'||ch[i]=='F')
                sum+=4;
            else if(ch[i]=='G'||ch[i]=='H'||ch[i]=='I')
                sum+=5;
            else if(ch[i]=='J'||ch[i]=='K'||ch[i]=='L')
                sum+=6;
            else if(ch[i]=='M'||ch[i]=='N'||ch[i]=='O')
                sum+=7;
            else if(ch[i]=='P'||ch[i]=='Q'||ch[i]=='R'||ch[i]=='S')
                sum+=8;
            else if(ch[i]=='T'||ch[i]=='U'||ch[i]=='V')
                sum+=9;
            else
                sum+=10;
        }
        sb.append(sum);
        System.out.println(sb);
    }
}
