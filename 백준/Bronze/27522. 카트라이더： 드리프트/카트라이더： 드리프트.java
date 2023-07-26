import java.io.*;
import java.util.*;
public class Main {
    static A[] a;
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        a=new A[8];
        for(int i=0;i<8;i++){
            st=new StringTokenizer(br.readLine());
            String as=st.nextToken();
            String s=st.nextToken();
            st=new StringTokenizer(as,":");
            int min=0;
            min+=Integer.parseInt(st.nextToken())*60000;
            min+=Integer.parseInt(st.nextToken())*1000;
            min+=Integer.parseInt(st.nextToken());
            a[i]=new A(min,s);
        }
        Arrays.sort(a);
        int cnt_red=0;
        int cnt_blue=0;
        if(a[0].s.equals("B")){
            cnt_blue+=10;
        }
        else cnt_red+=10;
        if(a[1].s.equals("B")){
            cnt_blue+=8;
        }
        else cnt_red+=8;
        int cnt=6;
        for(int i=2;i<8;i++){
            if(a[i].s.equals("B")){
                cnt_blue+=cnt;
            }
            else cnt_red+=cnt;
            cnt--;
        }
        if(cnt_red>cnt_blue)
            sb.append("Red");
        else sb.append("Blue");
        System.out.println(sb);
    }
    static class A implements Comparable<A>{
        int min;
        String s;
        public A(int min, String s){
            this.min=min;
            this.s=s;
        }

        @Override
        public int compareTo(A o){
            return Integer.compare(this.min, o.min);
        }
    }
}
