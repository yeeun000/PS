import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int []arr=new int[5];
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<5;j++){
                arr[j]=Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            if((arr[3]-arr[1])>=4){
                sb.append("KIN").append("\n");
            }
            else sb.append(arr[1]+arr[2]+arr[3]).append("\n");
        }
        System.out.println(sb);
    }
}
