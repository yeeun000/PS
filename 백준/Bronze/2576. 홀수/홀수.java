import java.io.*;
import java.util.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int []arr;
    public static void main(String[]args)throws IOException{
        input();
        logic();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        arr=new int[7];
        for(int i=0;i<7;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
    }
    static void logic(){
        int sum=0;
        int min=0;
        Arrays.sort(arr);
        for(int i=0;i<7;i++){
            if(arr[i]%2!=0){
                if(sum==0)
                    min=arr[i];
                sum+=arr[i];
            }
        }
        if(sum==0)
            sb.append("-1");
        else {
            sb.append(sum).append('\n');
            sb.append(min);
        }
        System.out.println(sb);
    }
}
