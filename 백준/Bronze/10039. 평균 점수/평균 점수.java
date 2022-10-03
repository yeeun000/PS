
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    public static void main(String[]args)throws IOException{
        input();
    }
    static void input()throws IOException{
     br=new BufferedReader(new InputStreamReader(System.in));
     sb=new StringBuilder();
     int Sum=0;
     for(int i=0;i<5;i++){
         int x=Integer.parseInt(br.readLine());
         if(x<40)
             x=40;
         Sum+=x;
     }
     sb.append(Sum/5);
     System.out.println(sb);
    }
}
