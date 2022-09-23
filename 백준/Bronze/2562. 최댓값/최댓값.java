
import java.util.*;
import java.io.*;
public class Main {
    static StringBuilder sb;
    static BufferedReader br;
    static int []arr;
    public static void main(String[]args) throws IOException{
        input();
        logic();
    }
    static void input()throws IOException{
        sb=new StringBuilder();
        br=new BufferedReader(new InputStreamReader(System.in));
        arr=new int[9];
        for(int i=0;i<9;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
    }
    static void logic(){
        int Max=0;
        int Num=0;
        for(int i=0;i<9;i++){
            if(arr[i]>Max) {
                Max=arr[i];
                Num=(i+1);
            }
        }
        sb.append(Max).append('\n').append(Num);
        System.out.println(sb);
    }
}
