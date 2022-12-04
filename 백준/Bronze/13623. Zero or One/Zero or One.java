import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int []arr=new int[3];
        int cnt=0;
        int io=0;
        for(int i=0;i<3;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            if(arr[i]==1)
                cnt++;
        }
        if(cnt==0 || cnt==3)
            sb.append("*");
        else{
            if(cnt==1){
                for(int i=0;i<3;i++){
                    if(arr[i]==1) {
                        io = i;
                        break;
                    }
                }
            }
            else if(cnt==2){
                for(int i=0;i<3;i++){
                    if(arr[i]==0) {
                        io = i;
                        break;
                    }
                }
            }
            if(io==0)
                sb.append("A");
            else if(io==1)
                sb.append("B");
            else sb.append("C");
        }
        System.out.println(sb);
    }
}
