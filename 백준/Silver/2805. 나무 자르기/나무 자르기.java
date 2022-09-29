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
        binarySearch();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void binarySearch() {
        long L = 0;
        long R = 2000000000;
        long X = 0;
        while (L <= R) {
            long mid = (L + R) / 2;
            if (de(mid)) {
                X = mid;
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        sb.append(X);
        System.out.println(sb);
    }

    static boolean de(long h) {
        long x = 0;
        for (int i = 0; i < N; i++) {
            int tree = arr[i];
            if (tree > h) {
                x += tree - h;
            }
        }
        return x >= M;
    }
}
