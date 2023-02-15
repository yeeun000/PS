import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str;
        while((str=br.readLine())!=null){
            char ch[]=str.toCharArray();
            for(int i=0;i<str.length();i++){
                if(ch[i]=='i')
                    ch[i]='e';
                else if(ch[i]=='e')
                    ch[i]='i';
                else if(ch[i]=='I')
                    ch[i]='E';
                else if(ch[i]=='E')
                    ch[i]='I';
            }
            System.out.println(String.valueOf(ch));
        }
    }
}
