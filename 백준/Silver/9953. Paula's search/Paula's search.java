import java.io.*;
public class Main {
    static int cnt=0;
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        int arr[]=new int [50];
        int ar[]=new int [50];
        for(int i=1;i<51;i++){
            arr[i-1]=i*2;
        }
        for(int i=1;i<51;i++){
            ar[i-1]=i*2-1;
        }
        while(N!=0){
            cnt=1;
            if(N%2==0) {
                binary(arr, 0, 49, N);
            }
            else{
                cnt++;
                binary(ar, 0, 49, N);
            }
            sb.append(cnt).append("\n");
            N=Integer.parseInt(br.readLine());
        }
        System.out.println(sb);
    }
    static int binary(int[]arr,int L, int R, int X){
        while(L<=R){
            int mid=(L+R)/2;
            if(arr[mid]==X)
                return mid;
            else if(arr[mid]<X)
                L=mid+1;
            else R=mid-1;
            cnt++;
        }
        return X;
    }
}
