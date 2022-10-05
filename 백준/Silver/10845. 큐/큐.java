import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int N;
    static Queue<Integer> q;

    public static void main(String[] args) throws IOException {
        input();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        q = new LinkedList<>();
        N = Integer.parseInt(br.readLine());
        int p=-1;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int size = q.size();
            String str = st.nextToken();
            if (str.equals("push")) {
                int x = Integer.parseInt(st.nextToken());
                q.add(x);
                p=x;
            } else if (str.equals("pop")) {
                if (size != 0) {
                    sb.append(q.poll()).append('\n');
                } else
                    sb.append("-1").append('\n');
            } else if (str.equals("size")) {
                sb.append(size).append('\n');
            } else if (str.equals("empty")) {
                if(size==0){
                    sb.append("1").append('\n');
                }
                else sb.append("0").append('\n');
            } else if (str.equals("front")) {
                if(size==0){
                    sb.append("-1").append('\n');
                }
                else {
                    sb.append(q.peek()).append('\n');
                }
            } else {
                if(size==0){
                    sb.append("-1").append('\n');
                }
                else {
                    sb.append(p).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}
