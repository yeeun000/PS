
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer st; // 컵 위치
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        for(int i = 0; i < N; i++){
            st=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            int temp=map.get(x);
            map.put(x,map.get(y));
            map.put(y,temp);
        }
        for(int i = 1; i <= 3; i++){
            if(map.get(i)==1){
                System.out.println(i);
                break;
            }
        }
    }
}
