import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     StringBuilder sb=new StringBuilder();
     StringTokenizer st=new StringTokenizer(br.readLine());
     int arr[]=new int[3];
     for(int i=0;i<3;i++){
         arr[i]=Integer.parseInt(st.nextToken());
     }
     Arrays.sort(arr);
     if(arr[0]==arr[1] && arr[1]==arr[2] && arr[0]==arr[2])
         sb.append("2");
     else if(arr[2]*arr[2]==(arr[0]*arr[0]+arr[1]*arr[1]))
         sb.append("1");
     else sb.append("0");
     System.out.println(sb);
    }
}
