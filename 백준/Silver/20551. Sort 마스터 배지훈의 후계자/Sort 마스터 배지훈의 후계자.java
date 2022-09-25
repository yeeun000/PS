import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    static StringBuilder sb;
    static BufferedReader br;
    static int N, M;
    static int[] A;
    static int[] D;

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
        A = new int[N];
        D = new int[M];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < M; i++) {
            D[i] = Integer.parseInt(br.readLine());
        }
    }

    static void logic() {
        Arrays.sort(A);
        int X;
        for (int i = 0; i < M; i++) {
            X = BinarySearch(A, 0, N - 1, D[i]);
            sb.append(X).append('\n');
        }
        System.out.println(sb);
    }

    static int BinarySearch(int[] arr, int L, int R, int X) {
        while (L <= R) {
            int mid = (L + R) / 2;
            if (arr[mid] == X){
                if(mid!=0&&arr[mid]==arr[mid-1]) {
                    for (int i = 0; i < N; i++) {
                        if (arr[mid] == arr[i])
                            return i;
                    }
                }
                return mid;
            }
            else if (arr[mid] < X)
                L = mid + 1;
            else
                R = mid - 1;
        }
        return -1;
    }
}
