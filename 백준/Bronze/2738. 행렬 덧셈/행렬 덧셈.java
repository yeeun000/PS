
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N,M;
    static int [][]arr;
    static int [][]arr_1;
    public static void main(String[]args) throws IOException{
        input();
        logic();
    }
    static void input() throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        st=new StringTokenizer(br.readLine());
        sb=new StringBuilder();
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        arr=new int[N][M];
        arr_1=new int[N][M];
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                arr_1[i][j]=Integer.parseInt(st.nextToken());
            }
        }
    }
    static void logic(){
        int [][]arr_result;
        arr_result=new int [N][M];
        if(N<101 && M<101){
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    if(arr_1[i][j]<101 && arr_1[i][j]>-101) {
                        if (arr[i][j] < 101 && arr[i][j] > -101) {
                            arr_result[i][j] = arr[i][j] + arr_1[i][j];
                            sb.append(arr_result[i][j]).append(" ");

                        }
                    }

                }
                sb.append('\n');
            }
            System.out.print(sb);
        }
    }
}
