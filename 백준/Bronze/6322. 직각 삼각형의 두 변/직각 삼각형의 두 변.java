import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (true) {
            count++;
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0)
                break;

            sb.append("Triangle #").append(count).append("\n");
            double l = 0;
            if (a == -1) {
                b = b * b;
                c = c * c;
                l = Math.sqrt(c - b);
                if (Double.isNaN(l) || l <= 0)
                    sb.append("Impossible.");
                else
                    sb.append("a");
            } else if (b == -1) {
                a = a * a;
                c = c * c;
                l = Math.sqrt(c - a);
                if (Double.isNaN(l) || l <= 0)
                    sb.append("Impossible.");
                else
                    sb.append("b");
            } else {
                a = a * a;
                b = b * b;
                l = Math.sqrt(a + b);
                if (Double.isNaN(l) || l <= 0)
                    sb.append("Impossible.");
                else
                    sb.append("c");
            }
            String re = String.format("%.3f", l);

            if (Double.isNaN(l) || l <= 0) {
                sb.append("\n\n");
                continue;
            }
            sb.append(" = ").append(re);
            sb.append("\n\n");
        }
        System.out.println(sb);
    }
}
