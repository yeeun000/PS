import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static BigInteger A, B;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        A = new BigInteger(st.nextToken());
        B = new BigInteger(st.nextToken());
    }

    static void logic() {
        BigInteger C = new BigInteger("1");
        if (A.compareTo(B) == -1) {
            BigInteger n = B.subtract(A);
            int a = n.intValue();
            sb.append(a - 1).append('\n');

            for (int i = 0; i < a - 1; i++) {
                A = A.add(C);
                sb.append(A).append(" ");
            }
        } else if (A.compareTo(B) == 1) {
            BigInteger n = A.subtract(B);
            int a = n.intValue();

            sb.append(a - 1).append('\n');

            for (int i = 0; i < a - 1; i++) {
                B = B.add(C);
                sb.append(B).append(" ");
            }
        }
        else sb.append("0");
        System.out.println(sb);
    }
}
