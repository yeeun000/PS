package PS;
import java.io.*;
import java.util.*;
public class Boj18411 {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int []arr=new int [3];
        for(int i=0;i<3;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        sb.append(arr[1]+arr[2]);
        System.out.println(sb);
    }
}
