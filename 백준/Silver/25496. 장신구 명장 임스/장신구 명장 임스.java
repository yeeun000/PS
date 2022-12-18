import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int P=Integer.parseInt(st.nextToken());
        int N=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        int []arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int cnt=0;
        while(P<200&&cnt<N){
            P+=arr[cnt];
            cnt++;
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}
