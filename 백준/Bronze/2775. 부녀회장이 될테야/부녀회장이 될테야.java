import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int k,n,N;
    public static void main(String[]args)throws IOException{
        input();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        int [][]arr=new int[15][14];
        arr[0][0]=1;
        arr[0][1]=2;
        for(int i=2;i<14;i++){
            arr[0][i]=i+1;
        }
        for(int i=0;i<15;i++){
            arr[i][0]=1;
        }
        for(int i=1;i<15;i++){
            for(int j=1;j<14;j++){
                arr[i][j]=arr[i-1][j]+arr[i][j-1];
            }
        }
        N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            k=Integer.parseInt(br.readLine());
            n=Integer.parseInt(br.readLine());
            sb.append(arr[k][n-1]).append('\n');
        }
        System.out.println(sb);
    }
}
