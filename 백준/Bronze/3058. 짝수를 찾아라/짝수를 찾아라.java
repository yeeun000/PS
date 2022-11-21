import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            ArrayList<Integer> arr=new ArrayList<>();
            int sum=0;
            for(int j=0;j<7;j++){
                int n=Integer.parseInt(st.nextToken());
                if(n%2==0) {
                    arr.add(n);
                    sum+=n;
                }
            }
            Collections.sort(arr);
            sb.append(sum+" "+arr.get(0)).append("\n");
        }
        System.out.println(sb);
    }
}
