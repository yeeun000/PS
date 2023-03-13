package PS;
import java.io.*;
import java.util.*;
public class Boj16727 {
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int []p=new int [2];
        int []s=new int [2];
        p[0]=Integer.parseInt(st.nextToken());
        s[0]=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        s[1]=Integer.parseInt(st.nextToken());
        p[1]=Integer.parseInt(st.nextToken());
        int sum_s=s[0]+s[1];
        int sum_p=p[0]+p[1];
        if(sum_s<sum_p)
            sb.append("Persepolis");
        else if(sum_s>sum_p)
            sb.append("Esteghlal");
        else {
            if(p[1]>s[0])
                sb.append("Persepolis");
            else if(p[1]<s[0])
                sb.append("Esteghlal");
            else sb.append("Penalty");
        }
        System.out.println(sb);
    }
}
