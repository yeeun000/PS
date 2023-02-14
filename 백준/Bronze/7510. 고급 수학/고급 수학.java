import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0;i<N;i++){
            sb.append("Scenario #").append(i+1).append(":").append("\n");
            int arr[]=new int [3];
            st=new StringTokenizer(br.readLine());
            arr[0]=Integer.parseInt(st.nextToken());
            arr[1]=Integer.parseInt(st.nextToken());
            arr[2]=Integer.parseInt(st.nextToken());
            Arrays.sort(arr);
            if(arr[2]*arr[2]==(arr[0]*arr[0]+arr[1]*arr[1]))
                sb.append("yes").append("\n");
            else sb.append("no").append("\n");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
