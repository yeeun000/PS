import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void logic() {
        int cnt = 0;
        int count=0;
        for (int j = 0; j < N; j++) {
            for (int i = 1; i < 1001; i++) {
                if (arr[j] == 1)
                    break;
                if(arr[j]%i==0)
                    cnt++;
                if(cnt>=3)
                    break;
            }
            if(cnt<3&&arr[j]!=1)
                count++;
            cnt=0;
        }
        sb.append(count);
        System.out.println(sb);
    }
}
