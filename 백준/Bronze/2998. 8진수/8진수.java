import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        if (s.length() % 3 == 1)
            s = "00" + s;
        else if (s.length() % 3 == 2)
            s = "0" + s;
        for (int i = 0; i < s.length(); i += 3) {
            String tmp = s.substring(i, i + 3);
            switch (tmp) {
                case "000":
                    sb.append("0");
                    break;
                case "001":
                    sb.append("1");
                    break;
                case "010":
                    sb.append("2");
                    break;
                case "011":
                    sb.append("3");
                    break;
                case "100":
                    sb.append("4");
                    break;
                case "101":
                    sb.append("5");
                    break;
                case "110":
                    sb.append("6");
                    break;
                case "111":
                    sb.append("7");
                    break;
            }
        }
        System.out.println(sb);
    }
}
