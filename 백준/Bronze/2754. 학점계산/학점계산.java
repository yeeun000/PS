
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static String str;
    public static void main(String[]args) throws IOException{
        input();
        logic();
    }
    static void input() throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        str=br.readLine();
    }
    static void logic(){
        if(str.equals("A+")){
            sb.append("4.3");
        }
        else if(str.equals("A0")){
            sb.append("4.0");
        }
        else if(str.equals("A-")){
            sb.append("3.7");
        }
        else if(str.equals("B+")){
            sb.append("3.3");
        }
        else if(str.equals("B0")){
            sb.append("3.0");
        }
        else if(str.equals("B-")){
            sb.append("2.7");
        }
        else if(str.equals("C+")){
            sb.append("2.3");
        }
        else if(str.equals("C0")){
            sb.append("2.0");
        }
        else if(str.equals("C-")){
            sb.append("1.7");
        }
        else if(str.equals("D+")){
            sb.append("1.3");
        }
        else if(str.equals("D0")){
            sb.append("1.0");
        }
        else if(str.equals("D-")){
            sb.append("0.7");
        }
        else sb.append("0.0");
        System.out.println(sb);
    }
}
