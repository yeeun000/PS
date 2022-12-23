import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int arr[][]=new int[N+1][N+1];
        for(int i=1;i<=N;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=1;j<=N;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        int ar[][]=new int [N+1][N+1];
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                ar[i][j]=ar[i-1][j]+ar[i][j-1]-ar[i-1][j-1]+arr[i][j];
            }
        }
        for(int i=0;i<M;i++){
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int c=Integer.parseInt(st.nextToken());
            int d=Integer.parseInt(st.nextToken());
            int sum=ar[c][d]-ar[a-1][d]-ar[c][b-1]+ar[a-1][b-1];
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
