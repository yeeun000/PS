
import java.io.*;
import java.util.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int N;
    static double []arr;
    public static void main(String[]args)throws IOException{
        input();
        logic();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        N=Integer.parseInt(br.readLine());
        arr=new double [N];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
    }
    static void logic(){
        double Sum=0;
        Arrays.sort(arr);
        for(int i=0;i<N;i++){
            Sum+=arr[i]/arr[N-1]*100;
        }
        Sum=Sum/N;
        sb.append(Sum);
        System.out.println(sb);
    }
}
