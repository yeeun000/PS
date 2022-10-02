
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int []arr;
    public static void main(String[]args)throws IOException{
        input();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        arr=new int [3];
        while(true){
            st=new StringTokenizer(br.readLine());
            for(int i=0;i<3;i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            if(arr[0]==0&&arr[1]==0&&arr[2]==0)
                break;
            logic();
        }
        System.out.println(sb);
    }
    static void logic(){
        Arrays.sort(arr);
        if(arr[2]*arr[2]==(arr[0]*arr[0]+arr[1]*arr[1]))
            sb.append("right").append('\n');
        else sb.append("wrong").append('\n');
    }
}
