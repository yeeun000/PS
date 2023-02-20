import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            String str=br.readLine();
            char []ch=str.toCharArray();
            int cnt=0;
            for(int j=0;j<str.length();j++){
                if(ch[j]=='U')
                    cnt++;
                else break;
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}
