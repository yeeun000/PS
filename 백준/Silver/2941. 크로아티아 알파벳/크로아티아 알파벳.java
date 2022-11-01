import java.io.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static String str;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        str = br.readLine();
        char ch[] = str.toCharArray();
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch[i] == 'd') {
                if (i + 1 != str.length() && ch[i + 1] == 'z') {
                    if (i + 2 != str.length() && ch[i + 2] == '=') {
                        cnt++;
                        i++;
                    }
                    else {
                        cnt+=2;
                    }
                    i++;
                }
                else if (i + 1 != str.length() && ch[i + 1] == '-') {
                    cnt++;
                    i++;
                }
                else {
                    cnt++;
                }
            } else if (ch[i] == 'l') {
                if (i + 1 != str.length() && ch[i + 1] == 'j') {
                    cnt++;
                    i++;
                }
                else {
                    cnt ++;
                }
            } else if (ch[i] == 'n') {
                if (i + 1 != str.length() && ch[i + 1] == 'j') {
                    cnt++;
                    i++;
                }
                else {
                    cnt++;
                }
            } else if (ch[i] == 'c') {
                if (i + 1 != str.length() && ch[i + 1] == '=') {
                    cnt++;
                    i++;
                }
                else if (i + 1 != str.length() && ch[i + 1] == '-') {
                    cnt++;
                    i++;
                }else {
                    cnt++;
                }
            }else if (ch[i] == 's') {
                if (i + 1 != str.length() && ch[i + 1] == '=') {
                    cnt++;
                    i++;
                } else {
                    cnt++;
                }
            }else if (ch[i] == 'z') {
                if (i + 1 != str.length() && ch[i + 1] == '=') {
                    cnt++;
                    i++;
                } else {
                    cnt++;
                }
            }else cnt++;
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}
