
import java.util.*;
import java.io.*;

public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static int[] arr;
    static int A;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        arr=new int [10];
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            A = Integer.parseInt(br.readLine());
                arr[i] = A % 42;
        }

    }

    static void logic() {
        int h = 1;
        Arrays.sort(arr);
        for (int i = 0; i < 9; i++) {
            if (arr[i] != arr[i + 1])
                h++;
        }
        sb.append(h);
        System.out.println(sb);
    }
}
