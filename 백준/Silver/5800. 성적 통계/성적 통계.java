import java.util.*;
import java.io.*;

public class Main {

    static StringBuilder sb;
    static BufferedReader br;
    static StringTokenizer st;

    static int X, N;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        input();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        X = Integer.parseInt(br.readLine());
        sb = new StringBuilder();
        for (int i = 1; i <= X; i++) {
            sb.append("Class ").append(i).append('\n');
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            logic();
        }     System.out.print(sb);
    }

    static void logic() {
        Arrays.sort(arr);
        int Largest = 0;
        int temp = 0;
        for (int i = 0; i < N - 1; i++) {
            temp = arr[i + 1] - arr[i];
            if (temp > Largest) {
                Largest = temp;
            }
        }
        sb.append("Max ").append(arr[N - 1]).append(", Min ").append(arr[0]).append(", Largest gap ").append(Largest).append('\n');

    }
}
