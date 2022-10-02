
import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static String str;
    static char []arr;
    public static void main(String[]args)throws IOException{
        input();
    }
    static void input()throws IOException{
        br=new BufferedReader(new InputStreamReader(System.in));
        sb=new StringBuilder();
        while(true) {
            str=br.readLine();
            arr=str.toCharArray();
            if(str.equals("0"))
                break;
            logic();
        }
        System.out.println(sb);
    }
    static void logic(){
        int Cnt=0;
        int j=str.length()-1;
        int s=str.length()/2+str.length()%2;
        for(int i=0;i<s;i++){
            if(arr[i]==arr[j]){
                Cnt++;
                j--;
            }
        }
        if(Cnt==s)
            sb.append("yes").append('\n');
        else sb.append("no").append('\n');

    }
}
