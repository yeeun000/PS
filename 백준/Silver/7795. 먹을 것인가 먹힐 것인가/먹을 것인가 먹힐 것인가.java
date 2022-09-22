import java.util.*;
import java.io.*;

public class Main {
    static StringBuilder sb;
    static StringTokenizer st;
    static BufferedReader br;
    static int T, N, M;
    static int[] arr, arr2;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            input();
            logic();
        }
    }

    static void input() throws IOException {
        sb=new StringBuilder();
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        arr2 = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void logic() {
        Arrays.sort(arr2);
        int Cnt=0;
        for(int i=0;i<N;i++){
            Cnt+=lower_bound(arr2,0,M ,arr[i]);
        }

        sb.append(Cnt).append('\n');
        System.out.print(sb);
    }

    static int lower_bound(int[] arr, int L, int R, int X) {
        while (L < R) {
            int mid = (L + R) / 2;
            if (arr[mid] >= X) {
                R = mid;
            } else {
                L = mid + 1;
            }
        }
        return L;
    }
}
