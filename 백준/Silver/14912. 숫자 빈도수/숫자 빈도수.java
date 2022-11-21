import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        String str=st.nextToken();
        int n=Integer.parseInt(st.nextToken());
        int cnt=0;
        for (int j = 1; j <= Integer.parseInt(str); j++) {
            String s = String.valueOf(j);
            char[] ch = s.toCharArray();
            for (int i = 0; i < s.length(); i++) {
                if (((int) ch[i] - 48) == n) {
                    cnt++;
                }
            }
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}
