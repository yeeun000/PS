import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        int []arr=new int [4];
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            String str=st.nextToken();
            int x=Integer.parseInt(st.nextToken());
            if(str.equals("BANANA"))
                arr[0]+=x;
            else if(str.equals("STRAWBERRY"))
                arr[1]+=x;
            else if(str.equals("LIME"))
                arr[2]+=x;
            else arr[3]+=x;
        }
        int cnt=0;
        for(int i=0;i<4;i++){
            if(arr[i]==5)
                cnt++;
        }
        if(cnt!=0)
            sb.append("YES");
        else sb.append("NO");
        System.out.println(sb);
    }
}
