import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int x[]=new int [3];
        int y[]=new int [3];
        for(int i=0;i<3;i++){
            st=new StringTokenizer(br.readLine());
            x[i]=Integer.parseInt(st.nextToken());
            y[i]=Integer.parseInt(st.nextToken());
        }
        int re_x=0;
        int re_y=0;
        Arrays.sort(x);
        Arrays.sort(y);
        if(x[0]==x[1])
            re_x=x[2];
        else if(x[1]==x[2])
            re_x=x[0];
        if(y[0]==y[1])
            re_y=y[2];
        else if(y[1]==y[2])
            re_y=y[0];
        sb.append(re_x+" "+re_y);
        System.out.println(sb);
    }
}
