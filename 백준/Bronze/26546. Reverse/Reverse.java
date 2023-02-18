import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            String str=st.nextToken();
            char ch[]=str.toCharArray();
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            for(int j=0;j<str.length();j++){
                if(j>=a&& j<b)
                    continue;
                sb.append(ch[j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
}
