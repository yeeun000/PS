
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int y=Integer.parseInt(st.nextToken());
        int c=Integer.parseInt(st.nextToken());
        int p=Integer.parseInt(st.nextToken());
        int min;
        if(y<p)
            min=y;
        else min=p;
        if(min>c/2)
            min=c/2;
        sb.append(min);
        System.out.println(sb);
    }
}
