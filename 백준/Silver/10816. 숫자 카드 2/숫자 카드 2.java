
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N,M;
    static int arr[];
    static int arr2[];
    public static void main(String[]args) throws IOException{
        input();
        logic();
    }
    static void input() throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        N=Integer.parseInt(br.readLine());
        arr=new int [N];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        M=Integer.parseInt(br.readLine());
        arr2=new int [M];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            arr2[i]=Integer.parseInt(st.nextToken());
        }
    }
    static void logic(){
        Arrays.sort(arr);
        for(int i=0;i<M;i++){
            int X=binarySearch(arr,0,N-1,arr2[i]);
            if(X==arr2[i]){
                int up=Upper_Bound(arr,0,N,arr2[i]);
                int lo=Lower_Bound(arr,0,N,arr2[i]);
                int Cnt=up-lo;
                sb.append(Cnt).append(" ");
            }
            else sb.append("0").append(" ");
        }
        System.out.println(sb);
    }
    static int binarySearch(int[]arr,int L,int R, int X){
        while(L<=R){
            int mid=(L+R)/2;
            if(arr[mid]==X){
                return X;
            }else if(arr[mid]<X){
                L=mid+1;
            }else
                R=mid-1;

        }
        return X;
    }
    static int Lower_Bound(int[]arr, int L, int R, int X){
        while(L<R){
            int mid=(L+R)/2;
            if(arr[mid]>=X){
                R=mid;
            }else L=mid+1;
        }
        return L;
    }
    static int Upper_Bound(int[]arr, int L, int R, int X){
        while(L<R){
            int mid=(L+R)/2;
            if(arr[mid]>X){
                R=mid;
            }else L=mid+1;
        }
        return L;
    }
}
