
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        int sum=0;
        double avg=0;
        double gpa=0;
        for(int i=0;i<N;i++){
            int M=Integer.parseInt(br.readLine());
            for(int j=0;j<M;j++){
                st=new StringTokenizer(br.readLine());
                gpa=Integer.parseInt(st.nextToken());
                sum+=gpa;
                avg+=gpa*Double.parseDouble(st.nextToken());
            }
            System.out.printf(sum+" ");
            System.out.printf("%.1f",avg/sum);
            System.out.println();
            sum=0;
            avg=0;
        }
    }
}
