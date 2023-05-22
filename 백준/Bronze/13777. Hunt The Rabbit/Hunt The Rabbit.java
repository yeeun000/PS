import java.io.*;
public class Main {
    static StringBuilder sb;
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        int []arr=new int [50];
        for(int i=0;i<50;i++){
            arr[i]=i+1;
        }
        while(N!=0){
            binary(arr,0,49,N);
            sb.append("\n");
            N=Integer.parseInt(br.readLine());
        }
        System.out.println(sb);
    }
    static int binary(int []arr, int L, int R, int X){
        while(L<=R){
            int mid=(L+R)/2;
            sb.append(arr[mid]).append(" ");
            if(arr[mid]==X) {
                return mid;
            }
            else if(arr[mid]<X) {
                L = mid + 1;
            }
            else {R=mid-1;}
        }
        return X;
    }
}
