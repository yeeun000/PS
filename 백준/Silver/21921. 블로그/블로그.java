import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int X=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        int []arr=new int [N];
        int []s=new int [N-X+1];
        int p=0;
        for(int i=0;i<X;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            s[p]+=arr[i];
        }
        for(int i=X;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            s[p+1]=s[p]+arr[i]-arr[p];
            p++;
        }
        Arrays.sort(s);
        int cnt=1;
        for(int i=N-X;i>0;i--){
            if(s[i]==s[i-1])
                cnt++;
            else break;
        }
        if(s[N-X]==0)
            sb.append("SAD");
        else sb.append(s[N-X]).append("\n").append(cnt);
        System.out.println(sb);
    }
}
