
import java.util.*;
import java.io.*;
public class Main {
    static StringTokenizer st;
    static StringBuilder sb;
    static BufferedReader br;
    static String arr_A;
    static String arr_B;
    static char[] ch_A;
    static char[] ch_B;
    static int []A;
    static int []B;
    public static void main(String[]args)throws IOException{
        input();
        logic();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        st=new StringTokenizer(br.readLine());
        sb=new StringBuilder();
        arr_A=st.nextToken();
        arr_B=st.nextToken();
        ch_A=arr_A.toCharArray();
        ch_B=arr_B.toCharArray();
        A=new int[3];
        B=new int[3];
        for(int i=0;i<3;i++){
            A[i]=Integer.parseInt(String.valueOf(ch_A[i]));
            B[i]=Integer.parseInt(String.valueOf(ch_B[i]));
        }

    }
    static void logic(){
        int a=0;
        for(int i=2;i>=0;i--){
            if(A[i]>B[i]){
                a=1;
                break;
            }
            else if(A[i]<B[i])
                break;
        }
        if(a==1){
            sb.append(A[2]).append(A[1]).append(A[0]);
        }
        else
            sb.append(B[2]).append(B[1]).append(B[0]);
        System.out.println(sb);
    }
}
