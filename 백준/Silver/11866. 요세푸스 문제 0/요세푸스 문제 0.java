

import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N, K;
    static ArrayList<Integer> arr;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        arr = new ArrayList<>(N);
        for (int i = 1; i <= N; i++) {
            arr.add(i);
        }
    }

    static void logic() {
        sb.append("<");
        int j = 0;
        int s = 1;
        while (j < N - 1) {
            for (int i = 0; i < arr.size(); i++) {
                if(arr.get(i)==0){
                    continue;
                }
                if (s == K) {
                    if(K==1&&j==N-1){
                        sb.append(arr.get(i)+">");
                        break;
                    }
                    sb.append(arr.get(i) + ", ");
                    arr.set(i,0);
                    j++;
                    s = 1;
                }
                else s++;

            }

        }
        if(K==1 && N==1){
            sb.append(arr.get(N-1) + ">");
            System.out.println(sb);
        }
        else if(K==1){
            System.out.println(sb);
        }
        else {
            Collections.sort(arr);
            sb.append(arr.get(N - 1) + ">");
            System.out.println(sb);
        }
    }
}
