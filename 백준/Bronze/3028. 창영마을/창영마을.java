import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        char ch[]=str.toCharArray();
        int x=1;
        for(int i=0;i<str.length();i++){
            if(ch[i]=='A'){
                if(x==1)
                    x=2;
                else if(x==2)
                    x=1;
            }
            else if(ch[i]=='B'){
                if(x==2)
                    x=3;
                else if(x==3)
                    x=2;
            }
            else{
                if(x==1)
                    x=3;
                else if(x==3)
                    x=1;
            }
        }
        sb.append(x);
        System.out.println(sb);
    }
}
