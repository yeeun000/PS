
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int []arr;
    public static void main(String[]args)throws IOException{
        input();
        logic();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        st=new StringTokenizer(br.readLine());
        sb=new StringBuilder();
        arr=new int[3];
        for(int i=0;i<3;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
    }
    static void logic(){
        Arrays.sort(arr);
        int Cnt=0;
        int s=0;
        int Sum=0;
        for(int i=0;i<2;i++) {
            if (arr[i] == arr[i + 1]) {
                Cnt++;
                s=arr[i];
                if(Cnt==2)
                    s=arr[i];
            }
            else if(Cnt==0)
                s=arr[i+1];
        }
        if(Cnt==2){
            Sum=10000+s*1000;
        }
        else if(Cnt==1){
            Sum=1000+s*100;
        }
        else{
            Sum=s*100;
        }
        sb.append(Sum);
        System.out.println(Sum);

    }
}
