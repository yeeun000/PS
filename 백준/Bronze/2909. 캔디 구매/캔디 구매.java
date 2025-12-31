import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String count=st.nextToken();
        int M = Integer.parseInt(st.nextToken());
        int N=Integer.parseInt(count);
        int sum=(int)Math.pow(10, M);
        int result= ((N+sum/2)/sum)*sum;
        System.out.println(result);

    }
}
