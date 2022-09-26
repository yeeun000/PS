

import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static int s, n;
    static String sn;
    public static void main(String[] args) throws IOException {
        input();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sn=" ";
        while ((sn=br.readLine())!=null) {
            st = new StringTokenizer(sn);
            n = Integer.parseInt(st.nextToken());
            s = Integer.parseInt(st.nextToken());
            int Sum = s / (n + 1);
            System.out.println(Sum);
        }
    }
}
