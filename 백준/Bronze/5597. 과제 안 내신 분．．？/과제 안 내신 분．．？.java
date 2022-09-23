
import java.util.*;
import java.io.*;
public class  Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int []arr;
    public static void main(String[]args) throws IOException{
        input();
        logic();
    }
    static void input() throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        arr=new int [30];
        for(int i=0;i<28;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        arr[28]=31;
        arr[29]=31;
    }
    static void logic(){
        Arrays.sort(arr);
        int j=0;
        for(int i=1;i<31;i++){
            if(arr[j]!=i){
               // System.out.print(i+" "+arr[j]);
                sb.append(i).append('\n');
            }
            else {
                //sb.append(arr[j]).append('\n');
                j++;
            }
        }
        System.out.println(sb);
    }

}
