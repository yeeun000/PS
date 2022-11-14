import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int [][]arr=new int [9][9];
        int max=-1;
        int max_i=-1;
        int max_j=-1;
        for(int i=0;i<9;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<9;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
                if(arr[i][j]>max){
                    max=arr[i][j];
                    max_i=i+1;
                    max_j=j+1;
                }
            }
        }
        sb.append(max).append('\n').append(max_i+" "+max_j);
        System.out.println(sb);
    }
}
