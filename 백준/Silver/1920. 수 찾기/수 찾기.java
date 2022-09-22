

import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    static StringBuilder sb;
    static BufferedReader br;
    static int N,M;
    static int []arr;
    static int []arr2;

    public static void main(String[]args)throws IOException{
        input();
        logic();
    }

    static void input() throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());
        arr=new int[N];
        sb=new StringBuilder();
        st=new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        M=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        arr2=new int[M];

        for(int i=0;i<M;i++){
            arr2[i]=Integer.parseInt(st.nextToken());
        }
    }
    static void logic(){
        Arrays.sort(arr);
        for(int i=0;i<M;i++){
            sb.append(binarySearch(arr,0,N-1,arr2[i])).append('\n');
        }
        System.out.println(sb);
    }
    static int binarySearch(int[]arr,int L,int R,int X){
        while(L<=R){
            int mid=(L+R)/2;
            if(arr[mid]==X){
                return 1;
            }
            else if(arr[mid]<X){
                L=mid+1;
            }
            else if(arr[mid]>X){
                R=mid-1;
            }
        }
        return 0;
    }
}
