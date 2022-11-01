import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int arr[]=new int[8];
        int ar[]=new int [8];
        for(int i=0;i<8;i++){
            int x=Integer.parseInt(br.readLine());
            arr[i]=x;
            ar[i]=x;
        }
        Arrays.sort(arr);
        sb.append(arr[7]+arr[6]+arr[5]+arr[4]+arr[3]).append("\n");
        for(int i=0;i<8;i++){
            if(arr[3]<=ar[i])
                sb.append(i+1).append(" ");
        }
        System.out.println(sb);
    }
}