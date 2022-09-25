
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static String str;
    static char[] ch;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        str = br.readLine();
        ch = str.toCharArray();
        arr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = Integer.parseInt(String.valueOf(ch[i]));
        }


    }

    static void logic() {
        Arrays.sort(arr);
        int D = 0;
        int a = 0;
        int temp = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (arr[i] == 6 || arr[i] == 9) {
                a++;
            }
            else if (arr[i] != 6 && arr[i] != 9 || arr[str.length() - 1] != 6 && arr[str.length() - 1] != 9) {
                if (arr[i] == arr[i + 1]) {
                    D++;
                    if (temp < D) {
                        temp = D;
                    }
                }else D = 0;
            }

        }
        if (arr[str.length()-1]==6||arr[str.length()-1]==9) {
            a++;
        }
        int p=0;
        int s=0;
        p=a%2;
        s=a/2;
        if (a == str.length()) {
            sb.append(s+p);
        }
        else {
            if (temp >= a / 2)
                sb.append(temp + 1);
            else sb.append(s+p);
        }
        System.out.println(sb);
    }
}
