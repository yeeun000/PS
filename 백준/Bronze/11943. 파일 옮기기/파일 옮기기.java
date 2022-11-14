import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int arr[]=new int[4];
        for(int i=0;i<2;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        st=new StringTokenizer(br.readLine());
        for(int i=2;i<4;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        if(arr[0]+arr[3]>arr[1]+arr[2])
            sb.append(arr[1]+arr[2]);
        else sb.append(arr[0]+arr[3]);
        System.out.println(sb);

    }
}
