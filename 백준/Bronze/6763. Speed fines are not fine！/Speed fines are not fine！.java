
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        if (A > B || A == B)
            sb.append("Congratulations, you are within the speed limit!");
        else {
            int s = B - A;
            if (s <= 20)
                sb.append("You are speeding and your fine is $100.");
            else if (s <= 30)
                sb.append("You are speeding and your fine is $270.");
            else sb.append("You are speeding and your fine is $500.");
        }
        System.out.println(sb);
    }
}
