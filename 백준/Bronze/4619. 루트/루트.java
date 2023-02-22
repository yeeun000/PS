import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int B=Integer.parseInt(st.nextToken());
        int N=Integer.parseInt(st.nextToken());
        while(B!=0 && N!=0){
            int i=1;
            int sum=0;
            int s=0;
            while(true) {
                s=i;
                for (int j = 1; j < N; j++) {
                    s *= i;
                }
                if (s > B) {
                    sum=s-B;
                    i--;
                    s=i;
                    for (int j = 1; j < N; j++) {
                        s *= i;
                    }
                    if(sum<B-s)
                        sb.append(i+1).append("\n");
                    else sb.append(i).append("\n");
                    break;
                }
                i++;
            }
            st=new StringTokenizer(br.readLine());
            B=Integer.parseInt(st.nextToken());
            N=Integer.parseInt(st.nextToken());
        }
        System.out.println(sb);
    }
}
