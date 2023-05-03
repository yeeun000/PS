import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        StringBuilder sb=new StringBuilder();
        int []arr=new int [3];
        int cnt_a=0;
        int cnt_b=0;
        for(int i=0;i<3;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i]==1)
                cnt_a++;
            else cnt_b++;
        }
        if(cnt_a<cnt_b)
            sb.append("2");
        else sb.append("1");
        System.out.println(sb);
    }
}
