import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int N;
    static Arr[] ar;
    public static void main(String[]args)throws IOException{
        input();
        logic();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        N=Integer.parseInt(br.readLine());
        ar=new Arr[N];
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            String name=st.nextToken();
            int day=Integer.parseInt(st.nextToken());
            int month=Integer.parseInt(st.nextToken());
            int year=Integer.parseInt(st.nextToken());
            ar[i]=new Arr(name, day, month, year);
        }
        Arrays.sort(ar);
    }
    static void logic(){
        sb.append(ar[N-1].name).append("\n");
        sb.append(ar[0].name);
        System.out.println(sb);
    }
    static class Arr implements Comparable<Arr>{
        String name;
        int day, month, year;
        public Arr(String name, int day, int month, int year){
            this.name=name;
            this. day=day;
            this.month=month;
            this.year=year;
        }
        @Override
        public int compareTo(Arr other){
            if(other.year==this.year){
                if(other.month==this.month){
                    if(other.day==this.day){
                        return this.name.compareTo(this.name);
                    }
                    return Integer.compare(this.day,other.day);
                }
                return Integer.compare(this.month,other.month);
            }
            return Integer.compare(this.year,other.year);
        }
    }
}
