import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String str=br.readLine();
        StringTokenizer st=new StringTokenizer(str,"/");
        int k=Integer.parseInt(st.nextToken());
        int d=Integer.parseInt(st.nextToken());
        int a=Integer.parseInt(st.nextToken());
        if(k+a<d || d==0)
            sb.append("hasu");
        else sb.append("gosu");
        System.out.println(sb);
    }
}
