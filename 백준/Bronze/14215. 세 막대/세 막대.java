import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int c=Integer.parseInt(st.nextToken());
        int max=0;
        int num=0;
        int num2=0;
        if(a>b && a>c){
            max=a;
            num=b;
            num2=c;
        }
        else if(b>a && b>c){
            max=b;
            num=a;
            num2=c;
        }
        else{
            max=c;
            num=a;
            num2=b;
        }
        if(max>=num+num2){
            max=num+num2-1;
        }
        System.out.println(max+num+num2);

    }
}
