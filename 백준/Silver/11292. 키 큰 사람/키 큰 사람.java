
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N;
    static ARR[] arr;
    public static void main(String[]args) throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        while(true) {
            N = Integer.parseInt(br.readLine());
            if (N != 0) {
                input();
                logic();
            }
            else break;
        }
        System.out.println(sb);
    }
    static void input() throws IOException{
        arr=new ARR [N];
        for(int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            String name=st.nextToken();
            float h=Float.parseFloat(st.nextToken());
            arr[i]=new ARR(name,h);
        }

        Arrays.sort(arr);
    }
    static void logic(){
        for(int i=0;i<N-1;i++){
            if(arr[i].h==arr[N-1].h){
                sb.append(arr[i].name).append(" ");
            }
        }
        sb.append(arr[N-1].name).append('\n');

    }
    static class ARR implements Comparable <ARR>{
        String name;
        float h;
        public ARR(String name, float h){
            this.name=name;
            this.h=h;
        }
        @Override
        public int compareTo(ARR other){
           return Float.compare(this.h, other.h);
        }
    }
}
