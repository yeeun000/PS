import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int []arr;
    static int N;
    public static void main(String[]args)throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        int cnt=0;
        N=Integer.parseInt(br.readLine());
        arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(br.readLine());
            if(arr[i]==0)
                cnt++;
        }
        if(cnt>N-cnt)
            sb.append("Junhee is not cute!");
        else sb.append("Junhee is cute!");
        System.out.println(sb);
    }
}
