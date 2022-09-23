
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N;
    static String []arr;
    public static void main(String[]args) throws IOException{
        input();
        logic();
    }
    static void input() throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        N=Integer.parseInt(br.readLine());
        arr=new String[N];
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            arr[i]=st.nextToken();
        }
    }
    static void logic(){
        Arrays.sort(arr);
        for(int i=N-1;i>=0;i--){
            if (i == 0) {
                sb.append(arr[i]);
            }
            else {
                if (arr[i].equals(arr[i - 1])) {
                    i --;
                }
                else {
                    sb.append(arr[i]).append('\n');
                }
            }

        }
        System.out.println(sb);
    }
}
