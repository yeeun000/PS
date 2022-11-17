import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        int i=100;
        int cnt=99;
        if(N<=99){
            sb.append(N);
        }
        else {
            while (true) {
                String s = Integer.toString(i);
                char[] ch = s.toCharArray();
                if (i < 1000) {
                    if ((ch[0] - ch[1]) == (ch[1] - ch[2])) {
                        cnt++;
                    }
                } else {
                    if ((ch[0] - ch[1]) == (ch[1] - ch[2]) && (ch[1] - ch[2]) == (ch[2] - ch[3])) {
                        cnt++;
                    }
                }
                if (i == N)
                    break;
                i++;
            }
            sb.append(cnt);
        }
        System.out.println(sb);
    }
}
