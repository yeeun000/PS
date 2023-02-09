import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        while(!str.equals("0")){
            char ch[]=str.toCharArray();
            int sum=0;
            for(int i=0;i<str.length();i++){
                if(ch[i]=='1')
                    sum+=2;
                else if(ch[i]=='0')
                    sum+=4;
                else sum+=3;
            }
            sum+=1+str.length();
            sb.append(sum).append("\n");
            str=br.readLine();
        }
        System.out.println(sb);
    }
}
