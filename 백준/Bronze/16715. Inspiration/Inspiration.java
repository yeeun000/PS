
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        int max=0;
        int b=0;
        for(int j=2;j<=N;j++){
            int num=base(j,N);
            if(num>max){
                max=num;
                b=j;
            }
        }
        sb.append(max).append(" ").append(b);
        System.out.println(sb);
    }

    public static Integer base(int j, int N){
        int sum=0;
        while(N>0){
            sum+=N%j;
            N=N/j;
        }
        return sum;
    }
}
