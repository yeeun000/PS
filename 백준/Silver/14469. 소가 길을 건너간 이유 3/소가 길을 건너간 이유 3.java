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
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[i] = new Arr(a, b);
        }
    }

    static void logic() {
        Arrays.sort(arr);
        int Sum = 0;
        if(N==1){
            Sum = arr[0].a + arr[0].b;
        }
        else {
            for (int i = 0; i < N - 1; i++) {
                if (i == 0)
                    Sum = arr[i].a + arr[i].b;
                if (Sum > arr[i + 1].a) {
                    Sum += arr[i + 1].b;
                } else {
                    Sum = arr[i + 1].a + arr[i + 1].b;
                }
            }
        }
        sb.append(Sum);
        System.out.println(sb);
    }

    static class Arr implements Comparable<Arr> {
        int a, b;

        public Arr(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(Arr other) {
            return Integer.compare(this.a, other.a);
        }
    }
}
