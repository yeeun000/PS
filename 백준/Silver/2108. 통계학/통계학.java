
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br;
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
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
    }

    static void logic() {
        Arrays.sort(arr);
        int Sum = 0;
        int j = 0;
        int temp = 0;
        int[] ar;
        ar = new int[N];
        int w = 0;
        for (int i = 0; i < N - 1; i++) {
            Sum += arr[i];
            if (arr[i] == arr[i + 1]) {
                j++;
                if (temp < j)
                    temp = j;
            } else
                j = 0;
        }
        j = 0;
        int k=0;
        for (int i = 0; i < N - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                j++;
                if (temp == j) {
                    ar[w] = arr[i];
                    w++;
                }
            } else {
                j = 0;
                k++;
            }
        }
        Sum += arr[N - 1];

        double a = (double) Sum / N;
        if (Sum/N == 0&&Sum%N<0)
            sb.append("0").append('\n');
        else
            sb.append(String.format("%.0f", a)).append('\n');
        sb.append(arr[N / 2]).append('\n');
        if (N == 1) {
            sb.append(arr[0]).append('\n');
        }
        else if(k==N-1){
            sb.append(arr[1]).append('\n');
        }
        else if (w ==0) {
            sb.append(ar[1]).append('\n');
        }
        else if(w ==1 ){
            sb.append(ar[0]).append('\n');
        }
        else {
            sb.append(ar[1]).append('\n');
        }
        sb.append(arr[N - 1] - arr[0]);
        System.out.println(sb);
    }
}
