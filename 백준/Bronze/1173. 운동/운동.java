import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int T=Integer.parseInt(st.nextToken());
        int R=Integer.parseInt(st.nextToken());  
        int sum=m;
        int count=0;
        int count_time=0;
        if(m+T>M)
            System.out.println("-1");
        else {
            while (count != N) {
                if (sum < M && sum + T <= M) {
                    sum += T;
                    count++;
                } else if (sum >= M || sum + T >= M) {
                    sum -= R;
                    if(sum<m)
                        sum=m;
                }
                count_time++;
            }
            System.out.println(count_time);
        }
    }
}
