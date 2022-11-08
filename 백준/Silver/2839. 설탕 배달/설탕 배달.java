import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[3];
        int five = N / 5;
        int five_result = N - 5 * five;
        int three = five_result / 3;
        int cnt = 0;
        if (N % 3 == 0 || N % 5 == 0) {
            int fi=N/5;
            int th=N/3;
            cnt++;
            arr[0] = (fi + th);
        }
        int f = 0;
        int t = 0;
        for (int i = 1; i <= five; i++) {
            f = N % 5 + i * 5;
            t = f / 3;
            if (f % 3 == 0) {
                arr[1] = (five - i + t);
                cnt++;
                break;
            }
        }
        if(five_result-3*three==0) {
            cnt++;
            arr[2] = five + three;
        }
        Arrays.sort(arr);
        if (cnt == 0)
            sb.append("-1");
        else {
            for (int i = 0; i < 3; i++) {
                if (arr[i] == 0)
                    continue;
                else {
                    sb.append(arr[i]);
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
