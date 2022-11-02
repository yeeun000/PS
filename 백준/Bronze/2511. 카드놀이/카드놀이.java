import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int A_arr[];
    static int B_arr[];
    public static void main(String[]args)throws IOException{
        input();
        logic();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        A_arr=new int [10];
        B_arr=new int [10];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<10;i++){
            A_arr[i]=Integer.parseInt(st.nextToken());
        }
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<10;i++){
            B_arr[i]=Integer.parseInt(st.nextToken());
        }
    }
    static void logic(){
        int A_cnt=0;
        int B_cnt=0;
        int D_cnt=0;
        int a=0,b=0;
        for(int i=0;i<10;i++){
            if(A_arr[i]>B_arr[i]) {
                A_cnt++;
                a=i;
            }
            else if(A_arr[i]<B_arr[i]) {
                B_cnt++;
                b=i;
            }
            else D_cnt++;
        }
        int A_sum=3*A_cnt+D_cnt;
        int B_sum=3*B_cnt+D_cnt;
        sb.append(A_sum+" "+B_sum).append("\n");
        if(A_sum>B_sum)
            sb.append("A");
        else if(A_sum<B_sum)
            sb.append("B");
        else{
            if(D_cnt==10)
                sb.append("D");
            else{
                if(a>b)
                    sb.append("A");
                else sb.append("B");
            }
        }
        System.out.println(sb);
    }
}
