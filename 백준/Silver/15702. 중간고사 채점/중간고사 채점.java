import java.io.*;
import java.util.*;
public class Main {
    static A[]a;
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int []arr=new int [N];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        a=new A [M];
        for(int i=0;i<M;i++){
            st=new StringTokenizer(br.readLine());
            int num=Integer.parseInt(st.nextToken());
            int sum=0;
            for(int j=0;j<N;j++){
                String s=st.nextToken();
                if(s.equals("O")) {
                    sum += arr[j];
                }
            }
            a[i]=new A(num,sum);
        }
        Arrays.sort(a);
        sb.append(a[0].num+" "+a[0].sum);
        System.out.println(sb);
    }
    static class A implements Comparable<A>{
        int num,sum;
        public A(int num, int sum){
            this.num=num;
            this.sum=sum;
        }

        @Override
        public int compareTo(A o){
            if(o.sum==this.sum){
                return Integer.compare(this.num,o.num);
            }
            return Integer.compare(o.sum,this.sum);
        }
    }
}
