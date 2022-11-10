import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        sb.append("Gnomes:").append("\n");
        for(int i=0;i<N;i++) {
            int []arr=new int [3];
            int []ar=new int[3];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<3;j++){
                int x=Integer.parseInt(st.nextToken());
                arr[j]=x;
                ar[j]=x;
            }
            Arrays.sort(ar);
            int no=0;
            int p=0;
            for(int j=0;j<3;j++){
                if(ar[j]==arr[j]){
                    no++;
                }
            }
            for(int j=0;j<3;j++){
                if(ar[2-j]==arr[j]){
                    p++;
                }
            }
            if(no==3||p==3)
                sb.append("Ordered").append("\n");
            else sb.append("Unordered").append("\n");
        }
        System.out.println(sb);
    }
}
