import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static String str;
    static int N;
    public static void main(String[]args)throws IOException{
        input();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            str=br.readLine();
            logic();
        }
        System.out.println(sb);
    }
    static void logic(){
        char[]ch=str.toCharArray();
        int a=0;
        int b=0;
        int x=0;
        for(char c:ch){
            if(c=='(')
                a++;
            else b++;
            if(b>a)
                x++;
        }
        if(a==b&&x==0)
            sb.append("YES").append('\n');
        else sb.append("NO").append('\n');
    }
}