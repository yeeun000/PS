import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        if(N>=M && M>2)
            sb.append("OLDBIE!");
        else if(M==1 || M==2)
            sb.append("NEWBIE!");
        else sb.append("TLE!");
        System.out.println(sb);
    }
}
