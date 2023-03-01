import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int i = 0;
        if (str.length() < 3) {
            if (str.length() % 3 == 1)
                sb.append(str.substring(i, i + 1));
            else if (str.length() % 3 == 2)
                sb.append(str.substring(i, i + 2));
        } else {
            if (str.length() % 3 == 1) {
                sb.append(str.substring(i, i + 1));
                sb.append(",");
                i += 1;
            } else if (str.length() % 3 == 2) {
                sb.append(str.substring(i, i + 2));
                sb.append(",");
                i += 2;
            }
            while (i + 3 != str.length()) {
                sb.append(str.substring(i, i + 3));
                sb.append(",");
                i += 3;
            }
            sb.append(str.substring(i, i + 3));

        }
        System.out.println(sb);
    }
}
