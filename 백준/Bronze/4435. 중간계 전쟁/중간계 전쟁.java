import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st;
        int sum_a;
        int sum_b;
        for(int i=0;i<N;i++){
            sb.append("Battle ").append(i+1).append(": ");
            sum_a = 0;
            sum_b = 0;
            for(int s=0;s<2;s++) {
                st = new StringTokenizer(br.readLine());
                if (s==0) {
                    for (int j = 0; j < 6; j++) {
                        if (j == 0)
                            sum_a += Integer.parseInt(st.nextToken());
                        else if (j == 1) {
                            sum_a += Integer.parseInt(st.nextToken()) * 2;
                        } else if (j == 4) {
                            sum_a += Integer.parseInt(st.nextToken()) * 4;
                        } else if (j == 5) {
                            sum_a += Integer.parseInt(st.nextToken()) * 10;
                        } else {
                            sum_a += Integer.parseInt(st.nextToken()) * 3;
                        }
                    }
                } else {
                    for (int j = 0; j < 7; j++) {
                        if (j == 0)
                            sum_b += Integer.parseInt(st.nextToken());
                        else if (j == 4) {
                            sum_b += Integer.parseInt(st.nextToken()) * 3;
                        } else if (j == 5) {
                            sum_b += Integer.parseInt(st.nextToken()) * 5;
                        } else if (j == 6) {
                            sum_b += Integer.parseInt(st.nextToken()) * 10;
                        } else {
                            sum_b += Integer.parseInt(st.nextToken()) * 2;
                        }
                    }
                }
            }
            if(sum_a<sum_b)
                sb.append("Evil eradicates all trace of Good").append("\n");
            else if(sum_a==sum_b)
                sb.append("No victor on this battle field").append("\n");
            else sb.append("Good triumphs over Evil").append("\n");
        }
        System.out.println(sb);
    }
}
