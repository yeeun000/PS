
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
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
            String str = br.readLine();
            arr[i] = new Arr(str);
        }
    }

    static void logic() {
        Arrays.sort(arr);

        int r = 0;
        if(N==1) {
            sb.append(arr[0].str);
            System.out.print(sb);
            return;
        }

        for (int i = 0; i < N - 1; i++) {
           // r++;
            if (!arr[i].str.equals(arr[i + 1].str)) {
                r++;
                sb.append(arr[i].str).append('\n');
                if (r == N - 1)
                    sb.append(arr[i + 1].str);
            } else {
                r++;
                if (arr[i].str.equals(arr[i + 1].str) && r == N - 1)
                    sb.append(arr[i].str);
            }
        }

        System.out.println(sb);
    }

    static class Arr implements Comparable<Arr> {
        public String str;

        public Arr(String str) {
            this.str = str;
        }

        @Override
        public int compareTo(Arr other) {
            if (this.str.length() == other.str.length()) {
                return this.str.compareTo(other.str);
            }
            return Integer.compare(this.str.length(), other.str.length());
        }
    }
}
