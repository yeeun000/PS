
import java.util.*;
import java.io.*;
public class Main {
    static StringTokenizer st;
    static StringBuilder sb;
    static BufferedReader br;
    static int N;
    static int []arr;

    public static void main(String[]args) throws IOException{
     input();
     logic();
    }
    static void input() throws IOException{

        br=new BufferedReader(new InputStreamReader(System.in));
//        st=new StringTokenizer(br.readLine(), ":");
        sb=new StringBuilder();
        N=Integer.parseInt(br.readLine());
        arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }

//        System.out.println(Arrays.toString(arr));
    }
    static void logic(){
        Arrays.sort(arr);

        for(int i = 0; i < N; i++) {
            int ans = arr[i];
           sb.append(ans).append("\n");
        }

        System.out.println(sb);
    }
}
