import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int C=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        Map<Integer,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<N;i++){
            Integer x=Integer.parseInt(st.nextToken());
            if (map.containsKey(x)) {
                map.put(x , map.get(x)+1);
            } else {
                map.put(x, 1);
            }
        }
        ArrayList<Integer> li = new ArrayList<>(map.keySet());
        Collections.sort(li, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return Integer.compare(map.get(b), map.get(a));
            }
        });
        for (Integer key : li) {
            for(int i=0;i<map.get(key);i++){
                sb.append(key).append(" ");
            }
        }
        System.out.println(sb);
    }
}
