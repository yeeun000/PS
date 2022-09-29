
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int N;
    static Stack<Integer> list;
    public static void main(String[]args)throws IOException{
        input();
    }
    static void input()throws IOException{
     br=new BufferedReader(new InputStreamReader(System.in));
     sb=new StringBuilder();
     N=Integer.parseInt(br.readLine());
    list=new Stack<>();
    for(int i=0;i<N;i++){
        int j=Integer.parseInt(br.readLine());
        if(j==0){
            list.pop();
            continue;
        }
        list.push(j);
    }
    int Cnt=0;
    for(int i=0;i<list.size() ;i++){
        Cnt+=list.get(i);
    }
    System.out.println(Cnt);

    }
}
