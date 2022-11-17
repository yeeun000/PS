import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int T=Integer.parseInt(br.readLine());
        for(int s=0;s<T;s++) {
        StringTokenizer st=new StringTokenizer(br.readLine());
        int J=Integer.parseInt(st.nextToken());
        int N=Integer.parseInt(st.nextToken());
        int []arr=new int[N];
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            arr[i]=Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int sum=0;
        int i=1;
        int cnt=0;
            while (true) {
                if (sum >= J)
                    break;
                sum += arr[N - i];
                cnt++;
                i++;
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}
