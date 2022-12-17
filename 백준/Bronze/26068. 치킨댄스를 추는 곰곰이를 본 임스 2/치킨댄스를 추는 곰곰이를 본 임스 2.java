import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        int cnt=0;
        for(int j=0;j<N;j++) {
            String str = br.readLine();
            char[] ch = str.toCharArray();
            if(str.length()>4)
                continue;
            else if(str.length()<4)
                cnt++;
            else {
                if (ch[2]<'9')
                    cnt++;
                else {
                    if (ch[3] < '1')
                        cnt++;
                }
            }
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}