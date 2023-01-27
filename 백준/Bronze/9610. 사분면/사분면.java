import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        int Q1=0;
        int Q2=0;
        int Q3=0;
        int Q4=0;
        int AXIS=0;
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            if(x==0 ||y==0){
                AXIS++;
            }
            else if(x>0&&y>0){
                Q1++;
            }
            else if(x>0&&y<0)
                Q4++;
            else if(x<0&&y>0)
                Q2++;
            else Q3++;
        }
        sb.append("Q1: "+Q1).append("\n");
        sb.append("Q2: "+Q2).append("\n");
        sb.append("Q3: "+Q3).append("\n");
        sb.append("Q4: "+Q4).append("\n");
        sb.append("AXIS: "+AXIS);
        System.out.println(sb);
    }
}
