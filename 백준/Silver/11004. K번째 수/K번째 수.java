import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<N;i++){
            arr.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(arr);
        sb.append(arr.get(K-1));
        System.out.println(sb);
    }
}
