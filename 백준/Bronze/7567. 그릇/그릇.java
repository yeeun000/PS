import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        char []ch=str.toCharArray();
        int sum=10;
        for(int i=0;i<str.length()-1;i++){
            if(ch[i]==ch[i+1])
                sum+=5;
            else sum+=10;
        }
        sb.append(sum);
        System.out.println(sb);
    }
}