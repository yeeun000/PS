import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int c=Integer.parseInt(st.nextToken());
        int arr[]=new int [3];
        int ar[]=new int [3];
        for(int i=0;i<3;i++){
            st=new StringTokenizer(br.readLine());
            arr[i]=Integer.parseInt(st.nextToken());
            ar[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        Arrays.sort(ar);
        int cnt=1;
        int sum=0;
        for(int i=arr[0];i<ar[2];i++){
            if(i==arr[1])
                cnt++;
            if(i==arr[2])
                cnt++;
            if(i==ar[0]) {
                cnt--;
            }
            if(i==ar[1]) {
                cnt--;
            }
            if(cnt==1){
                sum+=a;
            }
            else if(cnt==2){
                sum+=b*2;
            }
            else if(cnt==3){
                sum+=c*3;
            }
        }
        sb.append(sum);
        System.out.println(sb);
    }
}
