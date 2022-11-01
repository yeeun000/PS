import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int []arr;
    public static void main(String[]args)throws IOException{
        input();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        int cnt=0;
        for(int i=0;i<3;i++){
            arr=new int [4];
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<4;j++){
                arr[i]=Integer.parseInt(st.nextToken());
                if(arr[i]==0)
                    cnt++;
            }
            if(cnt==1)
                sb.append("A").append('\n');
            else if(cnt==2)
                sb.append("B").append('\n');
            else if(cnt==3)
                sb.append("C").append('\n');
            else if(cnt==4)
                sb.append("D").append('\n');
            else sb.append("E").append('\n');
            cnt=0;
        }
        System.out.println(sb);
    }
}
