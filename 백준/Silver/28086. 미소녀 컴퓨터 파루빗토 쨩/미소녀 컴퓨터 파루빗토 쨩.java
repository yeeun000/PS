
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char ch[] = str.toCharArray();
        char cl='a';
        int d = -1;
        for (int i = 1; i < str.length(); i++) {
            if (ch[i] == '+' || ch[i] == '-' || ch[i] == '*' || ch[i] == '/') {
                cl = ch[i];
                d = i;
                break;
            }
        }
        String a = str.substring(0,d);
        String b = str.substring(d + 1);
        long A,B;
        if(a.charAt(0)=='-')
            A=-Long.parseLong(a.substring(1), 8);
        else A=Long.parseLong(a,8);

        if(b.charAt(0)=='-')
            B=-Long.parseLong(b.substring(1), 8);
        else B=Long.parseLong(b,8);

        long r=0;
        if (B == 0 && cl == '/') {
            System.out.println("invalid");
        } else {
            switch (cl) {
                case '+':
                    r = A + B;
                    break;
                case '-':
                    r = A - B;
                    break;
                case '*':
                    r= A * B;
                    break;
                default:
                    r = A / B;
                    if(A % B != 0 && (A < 0 ^ B < 0))
                        r--;
            }
            String o;
            if (r < 0) {
                o = "-" + Long.toOctalString(-r);
            } else {
                o= Long.toOctalString(r);
            }
            System.out.println(o);
        }
    }
}
