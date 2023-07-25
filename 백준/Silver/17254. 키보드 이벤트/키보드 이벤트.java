import java.io.*;
import java.util.*;
public class Main {
    static A[] a;
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        a=new A[M];
        for(int i=0;i<M;i++){
            st=new StringTokenizer(br.readLine());
            int num=Integer.parseInt(st.nextToken());
            int cnt=Integer.parseInt(st.nextToken());
            String str=st.nextToken();
            a[i]=new A(num,cnt,str);
        }
        Arrays.sort(a);
        for(int i=0;i<M;i++){
            sb.append(a[i].str);
        }
        System.out.println(sb);

    }
    static class A implements Comparable<A>{
        int num,cnt;
        String str;

        public A(int num, int cnt, String str){
            this.num=num;
            this.cnt=cnt;
            this.str=str;
        }

        @Override
        public int compareTo(A o){
            if(this.cnt==o.cnt){
                return Integer.compare(this.num,o.num);
            }
            return Integer.compare(this.cnt,o.cnt);
        }
    }
}


