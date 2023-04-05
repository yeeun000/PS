import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<3;i++){
            String str=br.readLine();
            char ch[]=str.toCharArray();
            int cnt=1;
            int x=1;
            for(int j=0;j<7;j++){
                if(ch[j]==ch[j+1]) {
                    cnt++;
                }
                else{
                    if(cnt>x)
                        x=cnt;
                    cnt=1;
                }
            }
            if(cnt>x)
                x=cnt;
            sb.append(x).append("\n");
        }
        System.out.println(sb);
    }
}
