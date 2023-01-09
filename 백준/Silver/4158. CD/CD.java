import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int N;
    static int M;
    public static void main(String[]args)throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        StringTokenizer st;
        st=new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        while(N!=0 && M!=0){
            logic();
            st=new StringTokenizer(br.readLine());
            N=Integer.parseInt(st.nextToken());
            M=Integer.parseInt(st.nextToken());
        }
        System.out.println(sb);
    }
    static void logic() throws IOException{
        int []arr=new int [N];
        int cnt=0;
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<M;i++){
            int X=Integer.parseInt(br.readLine());
            if(binary(arr,0,N-1,X)==1)
                cnt++;
        }
        sb.append(cnt).append("\n");
    }
    static int binary(int []arr, int L, int R, int X){
        while(L<=R){
            int mid=(L+R)/2;
            if(arr[mid]==X)
                return 1;
            else if(arr[mid]<X)
                L=mid+1;
            else if(arr[mid]>X)
                R=mid-1;
        }
        return 0;
    }
}
