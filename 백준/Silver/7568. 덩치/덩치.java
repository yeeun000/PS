
import java.io.*;
import java.util.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int [][]arr;
    static int N;
    public static void main(String[] args) throws IOException {
        input();
        logic();
    }
    static void input()throws  IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        arr = new int[N][2];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
    }
    static void logic(){

        for(int i = 0; i < N; i++) {
            int rank=1;
            for(int j = 0; j < N; j++) {
                if(i == j) continue;
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++;
                }
            }
            sb.append(rank).append(' ');
        }
        System.out.println(sb);
    }
}