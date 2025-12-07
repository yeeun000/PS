
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String A=br.readLine();
        String B=br.readLine();
        String C=br.readLine();

        String ABC=A+B;
        int abc=Integer.parseInt(ABC)-Integer.parseInt(C);
        int a=Integer.parseInt(A)+Integer.parseInt(B)-Integer.parseInt(C);
        sb.append(a).append("\n").append(abc);
        System.out.println(sb);

    }
}
