import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int N;
    static Arr[] arr;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        arr = new Arr[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i] = new Arr(x, y);
        }
    }

    static void logic() {
        Arrays.sort(arr);
        for (int i = 0; i < N; i++) {
            sb.append(arr[i].x + " " + arr[i].y).append('\n');
        }
        System.out.println(sb);
    }

    static class Arr implements Comparable<Arr> {
        int x, y;

        public Arr(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int compareTo(Arr other) {
            if (other.y == this.y)
                return Integer.compare(this.x, other.x);

            return Integer.compare(this.y, other.y);

        }
    }
}
