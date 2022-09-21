
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int a,d,g;
    static int N;
    static int [][]arr;
    public static void main(String[]args) throws IOException{
        input();
        logic();
    }
    static void input() throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());
        sb=new StringBuilder();
        arr=new int [N][3];
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<3;j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }

        }
    }
    static void logic(){
        int Sum,Max=0;
        for(int j=0;j<N;j++) {
            Sum=arr[j][0]*(arr[j][1]+arr[j][2]);
            if(arr[j][0]==arr[j][1]+arr[j][2]){
                Sum*=2;
            }
            if(Max<Sum){
                Max=Sum;
            }
            Sum=0;
        }
        sb.append(Max);
        System.out.println(sb);
    }
}
