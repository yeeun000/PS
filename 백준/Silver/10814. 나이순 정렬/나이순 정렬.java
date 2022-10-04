import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N;
    static Arr[] arr;
    public static void main(String[]args)throws IOException{
        input();
        logic();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        N=Integer.parseInt(br.readLine());
        arr=new Arr[N];
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            int age=Integer.parseInt(st.nextToken());
            String name=st.nextToken();
            arr[i]=new Arr(age,name);
        }
    }
    static void logic(){
        Arrays.sort(arr);
        for(int i=0;i<N;i++){
            sb.append(arr[i].age+" "+arr[i].name).append('\n');
        }
        System.out.println(sb);
    }
    static class Arr implements Comparable<Arr>{
        String name;
        int age;
        public Arr(int age, String name){
            this.age=age;
            this.name=name;
        }
        public int compareTo(Arr other){
            return Integer.compare(this.age,other.age);
        }
    }
}
