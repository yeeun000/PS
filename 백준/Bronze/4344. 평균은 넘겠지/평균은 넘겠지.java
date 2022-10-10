

import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int N,A;
    static int []arr;

    public static void main(String[] args) throws IOException {
        input();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            arr=new int [A];
            for(int j=0;j<A;j++) {
                arr[j]= Integer.parseInt(st.nextToken());
            }
            logic();
        }
        System.out.println(sb);
    }

    static void logic() {
       int Sum=0;
       int j=0;
       for(int i=0;i<A;i++){
           Sum+=arr[i];
       }
      int x=Sum/A;
       for(int i=0;i<A;i++){
           if(x<arr[i])
               j++;
       }
       double a=(double)j/A*100;
       sb.append(String.format("%.3f",a)+"%").append('\n');
    }
}
