
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int n=0;
        int sum=0;
        while(true){
            n++;
            sum+=n;
            if(sum>=N){
                sum-=n;
                break;
            }
        }
        int index=N-sum;
        int low=index;
        int high=n-index+1;
        System.out.println(high+" "+low);
    }
}
