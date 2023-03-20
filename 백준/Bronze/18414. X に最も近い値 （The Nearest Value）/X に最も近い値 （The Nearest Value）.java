import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int x=Integer.parseInt(st.nextToken());
        int l=Integer.parseInt(st.nextToken());
        int R=Integer.parseInt(st.nextToken());
        if(x<=R && x>=l)
            sb.append(x);
        else if(x>R)
            sb.append(R);
        else sb.append(l);
        System.out.println(sb);
    }
}
