import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        StringTokenizer st=new StringTokenizer(str);
        int cnt=0;
        while(st.hasMoreTokens()){
            if(Integer.parseInt(st.nextToken())>0)
                cnt++;
        }
        sb.append(cnt);
        System.out.println(sb);
    }
}
