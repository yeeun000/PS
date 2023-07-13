import java.io.*;
import java.util.*;
public class Main {
    static Arr[] ar;
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        ar=new Arr[N];
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            String name=st.nextToken();
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            ar[i]=new Arr(name,a,b);
        }
        Arrays.sort(ar);
        for(int i=0;i<N;i++){
            String str=ar[i].name.toUpperCase();
            char c[]=str.toCharArray();
            sb.append(c[ar[i].b-1]);
        }
        System.out.println(sb);
    }

    static class Arr implements Comparable<Arr>{
        String name;
        int a;
        int b;
        public Arr(String name, int a, int b){
            this.name=name;
            this.a=a;
            this.b=b;
        }

        @Override
        public int compareTo(Arr o){
            return Integer.compare(this.a, o.a);
        }
    }
}
