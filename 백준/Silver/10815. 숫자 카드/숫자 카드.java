import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int N,M;
    static int N_arr[];
    static int M_arr[];
    public static void main(String[]args)throws IOException{
        input();
        logic();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        N=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        N_arr=new int[N];
        for(int i=0;i<N;i++){
            N_arr[i]=Integer.parseInt(st.nextToken());
        }
        M=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        M_arr=new int[M];
        for(int i=0;i<M;i++){
            M_arr[i]=Integer.parseInt(st.nextToken());
        }
    }
    static void logic(){
        Arrays.sort(N_arr);
        for(int i=0;i<M;i++){
          sb.append((binarySearch(N_arr,0,N-1,M_arr[i])));
          sb.append(" ");
        }
        System.out.println(sb);
    }
    static int binarySearch(int[]arr,int L,int R,int X){
        while(L<=R){
            int mid=(L+R)/2;
            if(arr[mid]==X)
                return 1;
            else if(arr[mid]<X)
                L=mid+1;
            else R=mid-1;
        }
        return 0;
    }
}
