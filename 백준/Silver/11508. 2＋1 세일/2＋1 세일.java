import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        Integer arr[]=new Integer[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr,Collections.reverseOrder());
        int sum=0;
        for(int i=0;i<N;i++){
            if(N%3==0){
                if(i%3==2)
                    continue;
                sum+=arr[i];
            }
            else if(N%3==1){
                if(i==N-2){
                    sum+=arr[N-1];
                    break;
                }
                if(i%3==2) {
                    continue;
                }
                sum+=arr[i];
            }
            else{
                if(i==N-3){
                    sum+=arr[N-1];
                    sum+=arr[N-2];
                    break;
                }
                if(i%3==2)
                    continue;
                sum+=arr[i];
            }
        }
        sb.append(sum);
        System.out.println(sb);
    }
}
