import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String N=br.readLine();
        char[]ch=N.toCharArray();
        int s=0;
        if(N.length()==3){
            if(ch[1]=='0'){
                s=10+ch[2]-48;
            }
            else if(ch[2]=='0'){
                s=ch[0]+10-48;
            }
        }
        else if(N.length()==4){
            s=20;
        }
        else s=ch[0]+ch[1]-48-48;
        System.out.println(s);
    }
}
