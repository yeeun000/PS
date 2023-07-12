import java.io.*;
import java.util.*;
public class Main {
    static Arr[] ar;
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int N=Integer.parseInt(br.readLine());
            ar=new Arr[N];
            for(int j=0;j<N;j++){
                st=new StringTokenizer(br.readLine());
                String name=st.nextToken();
                int cnt=Integer.parseInt(st.nextToken());
                ar[j]=new Arr(name,cnt);
            }
            Arrays.sort(ar);
            for(int j=0;j<N-1;j++){
                sb.append(ar[j].name).append(", ");
            }
            sb.append(ar[N-1].name).append("\n");
        }
        System.out.println(sb);
    }
    static class Arr implements Comparable<Arr>{
        String name;
        int cnt;
        public Arr(String name,int cnt){
            this.name=name;
            this.cnt=cnt;
        }

        @Override
        public int compareTo(Arr o){
            return Integer.compare(o.cnt, this.cnt);
        }
    }
}
