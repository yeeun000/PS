
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static String N;
    static char []arr;
    public static void main(String[]args)throws IOException{
        input();
        logic();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        N=br.readLine();
        arr=N.toCharArray();
    }
    static void logic(){
        Arrays.sort(arr);
        for(int i=N.length()-1;i>=0;i--){
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }
}
