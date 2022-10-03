import java.io.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static String str;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        str = br.readLine();
    }

    static void logic() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    System.out.print(":");
                    System.out.print(str);
                    System.out.print(":");
                }
                else
                    System.out.print(":fan:");
            }
            System.out.println("");
        }
    }
}
