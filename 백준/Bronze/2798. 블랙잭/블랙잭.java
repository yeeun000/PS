import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N, M;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void logic() {
        Arrays.sort(arr);
        int x = 0;
        int temp = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    x = arr[i] + arr[j] + arr[k];
                    if (x == M)
                        break;
                    else if (x < M) {
                        if (x > temp && x < M)
                            temp = x;
                    }
                    if (x > M) {
                        break;
                    }
                }
                if (x == M)
                    break;
            }
            if (x == M)
                break;
        }
        if (x == M)
            sb.append(x);
        else
            sb.append(temp);
        System.out.println(sb);
    }
}
