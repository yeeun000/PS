import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int sum_y=0;
        int sum_k=0;
        for(int j=0;j<T;j++) {
            for (int i = 0; i < 9; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                sum_y += Integer.parseInt(st.nextToken());
                sum_k += Integer.parseInt(st.nextToken());
            }
            if(sum_y>sum_k)
                sb.append("Yonsei").append("\n");
            else if(sum_y<sum_k)
                sb.append("Korea").append("\n");
            else sb.append("Draw").append("\n");
            sum_y=0;
            sum_k=0;
        }
        System.out.println(sb);
    }
}
