import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int cnt=0;
        for(int i=0;i<8;i++){
            String str=br.readLine();
            char []ch=str.toCharArray();
            if(i%2==0) {
                for (int j = 0; j < 7; j++) {
                    if (ch[j]=='F')
                        cnt++;
                    j++;
                }
            }
            else{
                for (int j = 1; j < 8; j++) {
                    if (ch[j]=='F')
                        cnt++;
                    j++;
                }
            }
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}
