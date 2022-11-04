import java.io.*;
import java.util.Arrays;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int i = 0;
        String s="";
        int no = 0;
        while (true) {
            i++;
            if (i > 1000000) {
                no++;
                break;
            }
            s = Integer.toString(i);
            char[] ch = s.toCharArray();
            sum = Integer.parseInt(s);
            for (int j = 0; j < s.length(); j++) {
                sum += ch[j]-'0';
            }
            if (sum == N)
                break;
        }
        if (no != 0)
            sb.append("0");
        else
            sb.append(s);
        System.out.println(sb);
    }
}
