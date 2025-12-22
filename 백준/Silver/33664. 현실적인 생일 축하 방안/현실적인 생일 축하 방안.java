
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long B= Long.parseLong(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String,Long> menu=new HashMap<>();
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            menu.put(st.nextToken(),Long.parseLong(st.nextToken()));
        }
        long p=0;
        for(int i=0;i<M;i++){
            p+=menu.get(br.readLine());
        }
        if(p<=B)
            System.out.println("acceptable");
        else System.out.println("unacceptable");
    }
}
