import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            String str=br.readLine();
            char ch[]=str.toCharArray();
            int cnt_g=0;
            int cnt_b=0;
            for(int j=0;j<str.length();j++){
                if(ch[j]=='G' || ch[j]=='g'){
                    cnt_g++;
                }
                else if(ch[j]=='B' || ch[j]=='b')
                    cnt_b++;
            }
            sb.append(str).append(" is ");
            if(cnt_g<cnt_b)
                sb.append("A BADDY");
            else if(cnt_g>cnt_b)
                sb.append("GOOD");
            else sb.append("NEUTRAL");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
