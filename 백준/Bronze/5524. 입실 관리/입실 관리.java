import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            String s=br.readLine();
            char ch[]=s.toCharArray();
            for(int j=0;j<s.length();j++){
                if(65<=ch[j]&&ch[j]<=90)
                    ch[j]=(char)(ch[j]+32);
            }
            String str=new String(ch);
            sb.append(str).append("\n");
        }
        System.out.println(sb);
    }
}
