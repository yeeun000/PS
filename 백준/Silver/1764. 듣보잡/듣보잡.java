import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        HashSet<String> set = new HashSet<>();
        ArrayList<String> re = new ArrayList<>();
        for(int i=0;i<N;i++){
            set.add(br.readLine());
        }
        int cnt=0;
        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            if(set.contains(str)){
                re.add(str);
                cnt++;
            }
        }
        Collections.sort(re);
        sb.append(cnt).append("\n");
        for(int i=0;i<re.size();i++){
            sb.append(re.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}
