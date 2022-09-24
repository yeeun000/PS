
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int x,y;
    public static void main(String[]args) throws IOException{
        input();
        logic();
    }
    static void input() throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        x=Integer.parseInt(br.readLine());
        y=Integer.parseInt(br.readLine());
    }
    static void logic(){
        if(x>0&&y>0){
            sb.append("1");
        }
        else if(x>0 && y<0)
            sb.append("4");
        else if(x<0 && y<0)
            sb.append("3");
        else sb.append("2");
        System.out.println(sb);
    }
}
