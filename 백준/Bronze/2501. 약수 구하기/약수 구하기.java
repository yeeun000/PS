import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    public static void main(String[]args)throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        st=new StringTokenizer(br.readLine());
        int A=Integer.parseInt(st.nextToken());
        int B=Integer.parseInt(st.nextToken());
        int []arr=new int[B];
        int cnt=0;
        for(int i=1;i<A+1;i++){
            if(A%i==0){
                if(cnt<B) {
                    arr[cnt] = i;
                    cnt++;
                }
            }
        }
        sb.append(arr[B-1]);
        System.out.println(sb);
    }
}
