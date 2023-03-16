import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        char ch[]=str.toCharArray();
        int N=Integer.parseInt(br.readLine());
        sb.append(ch[N-1]);
        System.out.println(sb);
    }
}
