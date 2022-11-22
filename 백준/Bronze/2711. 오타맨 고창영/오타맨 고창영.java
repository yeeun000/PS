import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int s=Integer.parseInt(st.nextToken());
            String str=st.nextToken();
            char []ch=str.toCharArray();
            for(int j=0;j<str.length();j++){
                if(s==j+1)
                    continue;
                sb.append(ch[j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
